import java.util.Scanner;

public class p11 {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return (b != 0) ? a / b : Double.NaN; }
    
    public static void display(double result) { System.out.println("Result: " + result); }

    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        display(add(num1, num2));
        display(subtract(num1, num2));
        display(multiply(num1, num2));
        display(divide(num1, num2));
    }
}
