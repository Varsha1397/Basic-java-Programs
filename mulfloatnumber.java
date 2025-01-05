package BasicProgram;

import java.util.Scanner;

public class mulfloatnumber {

    public static void main(String[] args) {
        //multiply floating numbers while user input

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first floating point number");
        float num1 = sc.nextFloat();

        System.out.println("Enter the second floating point number");
        float num2= sc.nextFloat();

        float product = num1*num2;

        System.out.println("The Product of " + num1 + " and " + num2 + " is: "  + product );


    }

}
