package Aula07;

public class Prisoner {
     private String nome;
     private double altura;
     private int sentenca;
     private Cell cell;
     
     public void think() {
    	 System.out.println("Ainda terei minha vingança");
     }
     
     public Prisoner() {
    	 
     }

	public Prisoner(String nome, double altura, int sentenca, Cell cell) {
		this.nome = nome;
		this.altura = altura;
		this.sentenca = sentenca;
		this.cell = cell;
	}
	
	 public void display(boolean b){
	        System.out.println("Name: " +getNome());
	        System.out.println("Height: " +getAltura());
	        System.out.println("Sentence: " +getSentenca());
	        System.out.println("Cell: " +getCell());
	    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getSentenca() {
		return sentenca;
	}

	public void setSentenca(int sentenca) {
		this.sentenca = sentenca;
	}

	public Cell getCell() {
		return cell;
	}

	public void setCell(Cell cell) {
		this.cell = cell;
	}
	 
	 
	 
	 
}
