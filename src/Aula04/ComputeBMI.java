package Aula04;


import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args)
	{
          Scanner scanner = new Scanner(System.in);
          System.out.println("Insira o peso em libras");
          double peso = scanner.nextDouble();
          System.out.println("Insira a altura em polegadas");
          double altura = scanner.nextDouble();
          double bmi = peso / (Math.pow(altura, 2)) * 703;
          System.out.println(bmi);
          System.out.println(Math.round(bmi));
          
          scanner.close();
        }
}
