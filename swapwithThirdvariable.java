package BasicProgram;

import java.util.Scanner;

public class swapwithThirdvariable {

    public static void main(String[] args) {

        //swap number with third variable

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        // Display numbers before swapping
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap the numbers using a third variable -temporary variable  - num 1 value stored in temporary var
                                                                           //num2= num1
                                                                           //value of number 1 (temporaray) assign to num2
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display numbers after swapping
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        sc.close();




    }
}
