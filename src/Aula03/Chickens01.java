package Aula03;

public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
    	int eggsPerChicken;
    	int chickenCount;
    	int totalEggs;
    	
    	//Segunda
    	eggsPerChicken = 5;
    	chickenCount = 3;
    	totalEggs = eggsPerChicken * chickenCount;
        //Terça
    	chickenCount++;
    	totalEggs += eggsPerChicken * chickenCount;
    	//Quarta
    	chickenCount /= 2;
    	totalEggs += eggsPerChicken * chickenCount;
    	
        
        System.out.println(totalEggs);
        //Segunda
        eggsPerChicken = 4;
    	chickenCount = 8;
    	totalEggs = eggsPerChicken * chickenCount;
    	//Terça
    	chickenCount++;
    	totalEggs += eggsPerChicken * chickenCount;
    	//Quarta
    	chickenCount /= 2;
    	totalEggs += eggsPerChicken * chickenCount;
    	
    	System.out.println(totalEggs);
    }   
}
