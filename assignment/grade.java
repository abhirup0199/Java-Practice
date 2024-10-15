import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the marks = ");
        int m = obj.nextInt();
        if(m <= 100 && m > 94)
        System.out.println("O");
        else if(m <= 94 && m > 84)
        System.out.println("A+");
        else if(m <= 84 && m > 74)
        System.out.println("A");
        else if(m <= 74 && m > 64)
        System.out.println("B");
        else if(m <= 59 && m > 49)
        System.out.println("C");
        else if(m <= 49 && m > 39)
        System.out.println("D");
        else if(m < 40)
        System.out.println("F");
    }
}