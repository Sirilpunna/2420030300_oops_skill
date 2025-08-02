package myproject;
import java.util.Scanner;
public class sum_of_squares {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum_of_squares=0;
        System.out.print("Enter the  number: ");
        int A = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            sum_of_squares += square;
            System.out.println("Square of " + i + " is: " + square);
        }
        System.out.println("The sum of squares of numbers from 1 to 10 is: " + sum_of_squares);
        	
        }
	}

