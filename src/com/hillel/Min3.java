package com.hillel;

import java.util.Scanner;

public class Min3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter a first number: ");
        a = scanner.nextInt();
        System.out.print("Enter a second number: ");
        b = scanner.nextInt();
        System.out.print("Enter a third number: ");
        c = scanner.nextInt();

        System.out.print("Minimum number is ");

        if(a < b && a < c)
            System.out.println(a);
        else if(b < c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
