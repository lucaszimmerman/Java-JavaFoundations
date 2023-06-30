package Aula04;

import java.util.Random;
import java.util.Scanner;

public class TestClass {

    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Digite a Temperatura em Fahrenheit");
    double f = scanner.nextDouble();
    convertion(f);
    System.out.println("Digite o Tamanho do Lado a");
    double a = scanner.nextDouble();
    System.out.println("Digite o Tamanho do Lado b");
    double b = scanner.nextDouble();
    hipotenusa(a,b);
    int dadoA = random.nextInt(6);
    int dadoB = random.nextInt(6);
    somaDados(dadoA,dadoB);
    scanner.close();
   }

	private static void somaDados(int dadoA, int dadoB) {
		int soma =  dadoA + dadoB;
		System.out.println("Dado 1: " + dadoA);
		System.out.println("Dado 2: " + dadoB);
		System.out.println("Soma dos dados: "+ soma );
		
	}

	private static void hipotenusa(double a, double b) {
		double c = Math.pow(a, 2) + Math.pow(b, 2);
		double hipo = Math.sqrt(c);
		System.out.printf("Hipotenusa: %.1f", hipo);
		System.out.println(" ");
	}

	private static void convertion(double f) {
		double c = 5.0/9.0 * (f-32);
		System.out.printf("Temperatura em Celsius: %.1f°%n", c);
		
	}
}