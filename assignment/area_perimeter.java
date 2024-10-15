import java.util.*;
public class area_perimeter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of length and width = ");
        int l = obj.nextInt();
        int w = obj.nextInt();
        System.out.println("Area = "+(l*w));
        System.out.println("Perimeter = "+(2*(l+w)));
    }
}