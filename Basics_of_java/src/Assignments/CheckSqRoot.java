package Assignments;

import java.util.Scanner;

public class CheckSqRoot {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Square root does not exist for negative numbers.");
        } else {
            double sqrt = Math.sqrt(num);

            if (sqrt == (int) sqrt) {
                System.out.println("Square root exists.");
                System.out.println("Square root of " + num + " is: " + (int) sqrt);
            } else {
                System.out.println("Square root exists but is not a perfect square.");
                System.out.println("Square root of " + num + " is: " + sqrt);
            }
        }
        sc.close();
    }
}

