import java.util.*;
public class calculator{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        char op;
        int a,b;
        System.out.println("-----MENU-----");
        System.out.println("'+' for sum\n'-' for substraction\n'*' for multiplication\n'/' for division");
        System.out.println("Enter the operator : ");
        op = sc.next().charAt(0);
        System.out.println("Enter the 1st value : ");
        a = sc.nextInt();
       	System.out.println("Enter the 2nd value : ");
        b = sc.nextInt();
        switch(op){
        	case '+' :
        	System.out.println(a + " " + op + " " + b + " = " + (a+b));
        	break;
        	case '-' :
        	System.out.println(a + " " + op + " " + b + " = " + (a-b));
        	break;
        	case '/' :
        	System.out.println(a + " " + op + " " + b + " = " + ((float)a/(float)b));
        	break;
        	case '*' :
        	System.out.println(a + " " + op + " " + b + " = " + (a*b));
        	break;
        	default:
        	System.out.println("Wrong Operator");
        	break;
        }
        
        sc.close();
    }
}
