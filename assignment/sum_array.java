import java.util.*;

public class sum_array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = obj.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        arr[i] = obj.nextInt();

        int sum = 0;

        for(int i = 0; i < n; i++)
        sum += arr[i];

        System.out.println("SUM = "+sum);
    }
}