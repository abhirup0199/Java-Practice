import java.util.*;

public class p8 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Row Size = ");
        int row = obj.nextInt();
        
        System.out.println("Column Size = ");
        int column = obj.nextInt();
        
        if (row != column) {
            System.out.println("Matrix must be square to calculate both diagonals.");
            return;
        }

        int arr[][] = new int[row][column];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = obj.nextInt();
            }
        }

        int diag_1 = 0;
        int diag_2 = 0;
        
        for (int i = 0; i < row; i++) {
            diag_1 += arr[i][i];
            diag_2 += arr[i][row - i - 1];
        }

        int max = (diag_1 > diag_2) ? diag_1 : diag_2;
        
        System.out.println("MAX = " + max);
        
        obj.close();
    }
}
