package Aula04;

public class Tip01 {
    public static void main(String[] args) {
        // Define the amounts owed before tax and tip
        double person1 = 10;
        double person2 = 12;
        double person3 = 9;
        double person4 = 8;
        double person5 = 7;
        double person6 = 15;
        double person7 = 11;
        double person8 = 30;
        
        // Calculate the total amount after tax and tip for each person
        double taxRate = 0.05; // 5% tax
        double tipRate = 0.15; // 15% tip
        
        double total1 = person1 * (1 + taxRate + tipRate);
        double total2 = person2 * (1 + taxRate + tipRate);
        double total3 = person3 * (1 + taxRate + tipRate);
        double total4 = person4 * (1 + taxRate + tipRate);
        double total5 = person5 * (1 + taxRate + tipRate);
        double total6 = person6 * (1 + taxRate + tipRate);
        double total7 = person7 * (1 + taxRate + tipRate);
        double total8 = person8 * (1 + taxRate + tipRate);
        
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);
        System.out.println(total5);
        System.out.println(total6);
        System.out.println(total7);
        System.out.println(total8);
        

    }
}