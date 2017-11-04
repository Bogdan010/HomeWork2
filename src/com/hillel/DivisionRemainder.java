package com.hillel;

import java.util.Scanner;

public class DivisionRemainder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("Enter a first number: ");
        a = scanner.nextInt();
        System.out.print("Enter a second number: ");
        b = scanner.nextInt();

        if(a % b == 0)
            System.out.println("No remainder.");
        else
            System.out.println("Remainder is " + a % b);
    }
}
