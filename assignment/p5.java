import java.util.*;
public class p5 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner obj = new Scanner(System.in);

        arr[0] = Integer.parseInt(args[0]);
        arr[1] = Integer.parseInt(args[1]);
        arr[2] = Integer.parseInt(args[2]);
        arr[3] = Integer.parseInt(args[3]);
        
        int max = arr[0];

        for(int i = 1; i < 4; i++)
        max = (max < arr[i])?arr[i]:max;

        System.out.println("MAX = "+max);
    }
}