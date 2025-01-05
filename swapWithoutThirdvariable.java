package BasicProgram;

import java.util.Scanner;

public class swapWithoutThirdvariable {

    public static void main(String[] args) {

        //swap numbers without third variable

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");

        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2= sc.nextInt();

//display before swapping
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap the numbers without using a third variable
        num1 = num1 + num2; // Step 1: Add the two numbers -
        num2 = num1 - num2; // Step 2: Subtract the new num2 from num1
        num1 = num1 - num2; // Step 3: Subtract the new num2 from num1 to get the original num2


        //Step 1: num1 = num1 + num2
        //The sum of num1 and num2 is stored in num1.
        //
        //Step 2: num2 = num1 - num2
        //Subtracting the original value of num2 (now stored in num1) gives the original value of num1.
        //
        //Step 3: num1 = num1 - num2
        //Subtracting the new value of num2 (which now holds the original value of num1) gives the original value of num2.

        // Display numbers after swapping
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        // Close the scanner
        sc.close();
    }
}
