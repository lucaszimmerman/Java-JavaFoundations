package Aula03;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.15";
        String gibberish = "887ds7nds87dsfs";
        
        //Parse shirtPrice and taxRate, and print the total tax
        int preco = Integer.parseInt(shirtPrice);
        double imposto = Double.parseDouble(taxRate);
        double totalTax = preco * imposto;
        System.out.println(totalTax);
        
        
        //Try to parse taxRate as an int
        //int impostofake = Integer.parseInt(shirtPrice);
        
        //Try to parse gibberish as an int
        //int seila = Integer.parseInt(gibberish);
        
        //System.out.println(shirtPrice);
        //System.out.println(gibberish);
        
    }
    
}
