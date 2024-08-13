import java.util.*;

public class max_diag{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Row Size = ");
		int row = obj.nextInt();
		System.out.println("Column Size = ");
		int column = obj.nextInt();
		
		int arr[][] = new int[row][column];
		
		int diag_1 = 0;
		int diag_2 = 0;
		
		for(int i = 0; i < row; i++)
		{
			diag_2 += arr[i][row - i - 1];
			for(int j = 0; j < column; j++)
			{
				if( i == j)
					diag_1 += arr[i][j];
			}
		}
		
		int max = (diag_1 > diag_2)? diag_1 : diag_2;
		
		System.out.println("MAX = "+max);
}	
				
