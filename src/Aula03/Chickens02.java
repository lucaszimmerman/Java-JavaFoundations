package Aula03;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
    	int totalEggs;
    	//Segunda
    	totalEggs = 100;
    	//Terça
    	totalEggs += 121;
    	//Quarta
    	totalEggs += 117;
    	
    	double dailyAverage = totalEggs/3.0;
    	double monthlyAverage = totalEggs*10;
    	double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}