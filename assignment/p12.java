import java.util.Scanner;

class Calculator {
    public static int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) { sum += num; }
        return sum;
    }

    public static int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) { result -= numbers[i]; }
        return result;
    }

    public static int multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) { result *= num; }
        return result;
    }
}

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) { numbers[i] = sc.nextInt(); }

        System.out.println("Sum: " + Calculator.add(numbers));
        System.out.println("Difference: " + Calculator.subtract(numbers));
        System.out.println("Product: " + Calculator.multiply(numbers));
    }
}
