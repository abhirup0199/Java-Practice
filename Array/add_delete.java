import java.util.*;
public class add_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int[] arr = new int[n];

        for(int i = 1; i > 0; i++)
        {
            System.out.println("-----MENU-----");
            System.out.println("1. Add element\n2. Delete element\n3. EXIT");

            int choice = sc.nextInt();

            switch(choice) {
                case 1 :
                    System.out.println("Do you want to add element by position or after any selected element?\n(e.g. POS - 1 or After Element - 10)");
                    System.out.print("Position or Element? : ");
                    String choice1 = sc.nextLine();
                    sc.nextLine();

                    switch(choice1) {
                        case "Position" :
                            System.out.print("Enter the position : ");
                            int p = sc.nextInt();

                            if(n = 0 && p == 1)
                            {
                                System.out.print("New Element : ");
                                arr[0] = sc.nextInt();
                                System.out.println("Element Added");
                            }
                            else if(n != 0)
                            {
                                ++n;
                                arr[n-1] = 0;
                                for(int j = n-1; j > p-1; j--)
                                {
                                    int temp = arr[j];
                                    arr[j] = arr[j-1];
                                    arr[j-1] = temp;
                                }
                                System.out.print("New Element : ");
                                arr[j] = sc.nextInt();
                                System.out.println("Element Added");
                            }

                    }
            }
        }
    }
}