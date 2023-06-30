package Aula04;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
    Random random = new Random();
    int randomInt = random.nextInt(3);
    if(randomInt == 0) {
    	System.out.println("Pedra");
    } else if (randomInt == 1) {
    	System.out.println("Papel");
    } else if (randomInt == 2) {
    	System.out.println("Tesoura");
    }

    }
}
