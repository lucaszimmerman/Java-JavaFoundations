package Aula03;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" quer comprar duas" + itemDesc;
        
        double price, imposto;
        int quantidade;
        
        price = 20.0;
        imposto = 32.45;
        quantidade = 2;
        
        double totalPrice = (price + imposto) * quantidade;
        String message2 = "o custo total do produto é = " + totalPrice;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        
        
        
        // Declare and assign a calculated totalPrice
        
        
        // Modify message to include quantity 
        
        System.out.println(message);
        System.out.println(message2);
        // Print another message with the total cost
        
    }    
}