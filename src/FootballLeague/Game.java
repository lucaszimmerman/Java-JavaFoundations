package FootballLeague;

import java.util.Random;

public class Game {
    private static int gameCount = 0;
    
    private int gameNumber;
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private int temperature;
    
    public Game(String homeTeam, String awayTeam, int temperature) {
        this.gameNumber = ++gameCount;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
        this.temperature = temperature;
    }
    
    public int getGameNumber() {
        return gameNumber;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getAwayTeam() {
        return awayTeam;
    }
    
    public int getHomeScore() {
        return homeScore;
    }
    
    public int getAwayScore() {
        return awayScore;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public void playGame() {
        Random random = new Random();
        homeScore = random.nextInt(5);
        awayScore = random.nextInt(5);
    }
    
    public void printGameDetails() {
        System.out.println("Game #" + gameNumber);
        System.out.println("Temperature: " + temperature);
        System.out.println("Away Team: " + awayTeam + ", " + awayScore);
        System.out.println("Home Team: " + homeTeam + ", " + homeScore);
        System.out.println();
    }
}

