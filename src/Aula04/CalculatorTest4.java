package Aula04;

public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        double totalConta = calc.findTotal(10, "Marcos") +
        calc.findTotal(12, "Lucas") +
        calc.findTotal(9,  "João") +
        calc.findTotal(8,  "André") +
        calc.findTotal(7,  "Pedro") +
        calc.findTotal(15, "Alex") +
        calc.findTotal(11, "Carlos")+
        calc.findTotal(30, "Maicon");
       

        //Find and print the entire table's total, including tax and tip
        System.out.println(totalConta);
    } 
}
