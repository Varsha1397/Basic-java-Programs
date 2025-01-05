package BasicProgram;

import DEC24.Conditions.IF1;

import javax.swing.*;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        // CHECK NUM IS EVEN OR ODD

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");

        int a = sc.nextInt();

        if (a % 2 == 1)

            System.out.println("ODD Number");
        else
            System.out.println("Even Number");
        }
    }


