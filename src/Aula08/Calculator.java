package Aula08;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) x / y;
    }
}
