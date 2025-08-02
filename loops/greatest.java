package myproject;
import java.util.*;
public class greatest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the A number: ");
        int A = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the B number3: ");
        int B = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter the C number: ");
        int C = sc.nextInt();
        sc.nextLine();
        if(A>B&&A>C) {
        	System.out.println("The greatest number is A: " + A);
        }if(B>A&&B>C){
        	System.out.println("The greatest number is B: " + B);
        }else {
        	System.out.println("The greatest number is C: " + C);
        }
    }
}
