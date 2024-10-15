import java.util.*;
public class largest {
    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner obj = new Scanner(System.in);

        System.out.println("INPUT = ");

        for(int i = 0; i < 4; i++)
        arr[i] = obj.nextInt();
        
        int max = arr[0];

        for(int i = 1; i < 4; i++)
        max = (max < arr[i])?arr[i]:max;

        System.out.println("MAX = "+max);
    }
}