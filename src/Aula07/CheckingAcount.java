package Aula07;

public class CheckingAcount {
     public double balance;
     public String name;
     
     public void withDraw(double value) {
    	 if (value < 100) {
			System.out.println("Muito Baixo");
		} else if (value < 0) {
			System.out.println("Não é possível valor negativo");
		} else {
			balance -= value;
			System.out.println("valor atual: " + balance);
			
		}
     }
}
