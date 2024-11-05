import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Element not found in the array.");
        }
    }
}
