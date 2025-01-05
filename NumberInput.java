package BasicProgram;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the input number
        int number = scanner.nextInt();

        // Print the entered number
        System.out.println("You entered: " + number);

        // Close the scanner
        scanner.close();
    }
}