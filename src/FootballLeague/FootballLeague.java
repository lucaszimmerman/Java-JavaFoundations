package FootballLeague;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FootballLeague {
    private static final int MIN_TEMPERATURE = 32;
    private static final int MAX_TEMPERATURE = 100;
    private static final int MIN_CONSECUTIVE_COLD_WEEKS = 3;
    
    private List<Team> teams;
    private List<Game> games;
    private int consecutiveColdWeeks;
    
    public FootballLeague() {
        teams = new ArrayList<>();
        games = new ArrayList<>();
        consecutiveColdWeeks = 0;
    }
    
    public void addTeam(String name) {
        Team team = new Team(name);
        teams.add(team);
    }
    
    public void playSeason() {
        Scanner scanner = new Scanner(System.in);
        
        while (consecutiveColdWeeks < MIN_CONSECUTIVE_COLD_WEEKS) {
            System.out.print("Enter temperature for the week (32-100): ");
            int temperature = scanner.nextInt();
            
            if (temperature < MIN_TEMPERATURE) {
                consecutiveColdWeeks++;
                System.out.println("Too cold to play.");
            } else if (temperature > MAX_TEMPERATURE) {
                System.out.println("Invalid temperature. Try again.");
            } else {
                consecutiveColdWeeks = 0;
                playGames(temperature);
            }
        }
        
        System.out.println("Season is over");
        System.out.println("\n*********RESULTS*********\n");
        
        for (Team team : teams) {
            team.printStatistics();
        }
        
        printGameStatistics();
        scanner.close();
    }
    
    private void playGames(int temperature) {
        Random random = new Random();
        int gameCount = 0;
        
        while (gameCount < 2) {
            Team homeTeam = getRandomTeam();
            Team awayTeam = getRandomTeam();
            
            if (homeTeam != awayTeam) {
                Game game = new Game(homeTeam.getName(), awayTeam.getName(), temperature);
                game.playGame();
                games.add(game);
                
                updateTeamStatistics(homeTeam, game.getHomeScore(), game.getAwayScore());
                updateTeamStatistics(awayTeam, game.getAwayScore(), game.getHomeScore());
                
                gameCount++;
            }
        }
    }
    
    private Team getRandomTeam() {
        Random random = new Random();
        int index = random.nextInt(teams.size());
        return teams.get(index);
    }
    
    private void updateTeamStatistics(Team team, int goalsScored, int goalsAllowed) {
        if (goalsScored > goalsAllowed) {
            team.incrementWins();
        } else if (goalsScored < goalsAllowed) {
            team.incrementLosses();
        } else {
            team.incrementTies();
        }
        
        team.incrementGoalsScored(goalsScored);
        team.incrementGoalsAllowed(goalsAllowed);
    }
    
    private void printGameStatistics() {
        int hottestTemp = Integer.MIN_VALUE;
        int totalTemp = 0;
        
        for (Game game : games) {
            game.printGameDetails();
            
            int temperature = game.getTemperature();
            
            if (temperature > hottestTemp) {
                hottestTemp = temperature;
            }
            
            totalTemp += temperature;
        }
        
        double averageTemp = (double) totalTemp / games.size();
        
        System.out.println("Hottest Temp: " + hottestTemp);
        System.out.println("Average Temp: " + averageTemp);
    }

    public static void main(String[] args) {
        FootballLeague league = new FootballLeague();
        league.addTeam("Team 1");
        league.addTeam("Team 2");
        league.addTeam("Team 3");
        league.addTeam("Team 4");
        league.playSeason();
    }
    
}

