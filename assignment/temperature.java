import java.util.*;
public class temperature {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the temperature value in Celsius = ");
        int c = obj.nextInt();
        int f = (c*9/5)+32;
        System.out.println("Fahrenheit = "+f);
    }
}