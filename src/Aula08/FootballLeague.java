package Aula08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FootballLeague {
    private static final int NUM_TEAMS = 4;
    private static final int MIN_TEMPERATURE = -10;
    private static final int MAX_TEMPERATURE = 100;
    private static final int NUM_CONSECUTIVE_COLD_WEEKS_TO_END_SEASON = 3;

    private Team[] teams;
    private List<Game> games;
    private int consecutiveColdWeeks;

    public FootballLeague() {
        teams = new Team[NUM_TEAMS];
        games = new ArrayList<>();
        consecutiveColdWeeks = 0;

        teams[0] = new Team("Team 1");
        teams[1] = new Team("Team 2");
        teams[2] = new Team("Team 3");
        teams[3] = new Team("Team 4");
    }

    public void simulateSeason() {
        Random random = new Random();

        while (consecutiveColdWeeks < NUM_CONSECUTIVE_COLD_WEEKS_TO_END_SEASON) {
            int temperature = random.nextInt(MAX_TEMPERATURE - MIN_TEMPERATURE + 1) + MIN_TEMPERATURE;

            if (temperature >= 0) {
                playGames(temperature);
            } else {
                System.out.println("Too cold to play.");
                consecutiveColdWeeks++;
            }
        }

        printStatistics();
    }

    private void playGames(int temperature) {
        Random random = new Random();
        System.out.println("Temperature: " + temperature);

        for (int i = 0; i < 2; i++) {
            Team awayTeam = getRandomTeam();
            Team homeTeam = getRandomTeamExcluding(awayTeam);

            int awayScore = random.nextInt(temperature + 1);
            int homeScore = random.nextInt(temperature + 1);

            Game game = new Game(awayTeam, homeTeam, awayScore, homeScore, temperature);
            games.add(game);

            updateTeamStatistics(awayTeam, awayScore, homeScore);
            updateTeamStatistics(homeTeam, homeScore, awayScore);

            System.out.println("Game #" + (games.size()) + "\n" + game.toString() + "\n");
        }
    }

    private Team getRandomTeam() {
        Random random = new Random();
        int index = random.nextInt(NUM_TEAMS);
        return teams[index];
    }

    private Team getRandomTeamExcluding(Team excludedTeam) {
        List<Team> availableTeams = new ArrayList<>(Arrays.asList(teams));
        availableTeams.remove(excludedTeam);
        Random random = new Random();
        int index = random.nextInt(NUM_TEAMS - 1);
        return availableTeams.get(index);
    }

    private void updateTeamStatistics(Team team, int scoredGoals, int allowedGoals) {
        team.incrementGamesPlayed();
        team.incrementGoalsScored(scoredGoals);
        team.incrementGoalsAllowed(allowedGoals);

        if (scoredGoals > allowedGoals) {
            team.incrementWins();
        } else if (scoredGoals < allowedGoals) {
            team.incrementLosses();
        } else {
            team.incrementTies();
        }
    }

    private void printStatistics() {
        System.out.println("\n*********RESULTS*********\n");

        for (Team team : teams) {
            System.out.println(team.toString());
        }

        System.out.println();

        for (Game game : games) {
            System.out.println(game.toString());
        }

        int hottestTemperature = findHottestTemperature();
        double averageTemperature = calculateAverageTemperature();

        System.out.println("Hottest Temp: " + hottestTemperature);
        System.out.println("Average Temp: " + averageTemperature);
    }

    private int findHottestTemperature() {
        int hottestTemperature = Integer.MIN_VALUE;

        for (Game game : games) {
            if (game.getTemperature() > hottestTemperature) {
                hottestTemperature = game.getTemperature();
            }
        }

        return hottestTemperature;
    }

    private double calculateAverageTemperature() {
        double totalTemperature = 0;

        for (Game game : games) {
            totalTemperature += game.getTemperature();
        }

        return totalTemperature / games.size();
    }

    public static void main(String[] args) {
        FootballLeague league = new FootballLeague();
        league.simulateSeason();
    }
}

class Team {
    private String name;
    private int wins;
    private int losses;
    private int ties;
    private int goalsScored;
    private int goalsAllowed;
    private int gamesPlayed;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public void incrementWins() {
        wins++;
    }

    public int getLosses() {
        return losses;
    }

    public void incrementLosses() {
        losses++;
    }

    public int getTies() {
        return ties;
    }

    public void incrementTies() {
        ties++;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void incrementGoalsScored(int goals) {
        goalsScored += goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void incrementGoalsAllowed(int goals) {
        goalsAllowed += goals;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void incrementGamesPlayed() {
        gamesPlayed++;
    }

    @Override
    public String toString() {
        return name + "\n" +
                "Wins: " + wins + ", Losses: " + losses + ", Ties: " + ties + "\n" +
                "Points Scored: " + goalsScored + ", Points Allowed: " + goalsAllowed + "\n";
    }
}

class Game {
    private static int gameCount = 0;

    private int id;
    private Team awayTeam;
    private Team homeTeam;
    private int awayScore;
    private int homeScore;
    private int temperature;

    public Game(Team awayTeam, Team homeTeam, int awayScore, int homeScore, int temperature) {
        this.id = ++gameCount;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.awayScore = awayScore;
        this.homeScore = homeScore;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + "\n" +
                "Away Team: " + awayTeam.getName() + ", " + awayScore + "\n" +
                "Home Team: " + homeTeam.getName() + ", " + homeScore;
    }
}
