import java.util.Scanner;

public class sum_array{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("\nEnter the size of the array : ");
		
		int n = obj.nextInt();
		int sum = 0;
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("\nEnter the value of Element " + (i+1));
			arr[i] = obj.nextInt();
		}
			
		for(int i = 0; i < n; i++)
			sum += arr[i];
			
		System.out.println("\nSum of the array elements = " + sum);
		
		obj.close();
	}
}
