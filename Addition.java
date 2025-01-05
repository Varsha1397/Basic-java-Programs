package BasicProgram;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Addition {
    public static void main(String[] args) {
        //Addition of atwo numbers while input numbers from user

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Your First Number");

        int number1 = scanner.nextInt();
        System.out.println("Enter Your Second Number" );

        int number2 = scanner.nextInt();

        int sum= number1+number2;

        System.out.println("The sum of " + number1 + " and " + number2 + " is : "  + sum);

        scanner.close();







    }

}
