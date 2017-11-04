package com.hillel;

import java.util.Scanner;

public class NearNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("Enter a first number: ");
        a = scanner.nextInt();
        System.out.print("Enter a second number: ");
        b = scanner.nextInt();

        int i = Math.abs(a - 10);
        int k = Math.abs(b - 10);

        if(i < k)
            System.out.println("Number " + a + " is nearest to 10.");
        else if(i > k)
            System.out.println("Number " + b + " is nearest to 10.");
        else
            System.out.println("This numbers are equidistant from 10.");
    }
}
