package Aula07;

public class AccountTest {

	public static void main(String[] args) {
		CheckingAcount a1 = new CheckingAcount();
		a1.name = "nome";
		a1.balance = 123;
		
		a1.withDraw(-2);

	}

}
