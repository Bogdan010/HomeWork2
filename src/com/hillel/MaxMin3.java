package com.hillel;

import java.util.Scanner;

public class MaxMin3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, max, min;

        System.out.print("Enter a first number: ");
        a = scanner.nextInt();
        System.out.print("Enter a second number: ");
        b = scanner.nextInt();
        System.out.print("Enter a third number: ");
        c = scanner.nextInt();

        if(a < b && a < c)
            min = a;
        else if(b < c)
            min = b;
        else
            min = c;

        if(a > b && a > c)
            max = a;
        else if(b > c)
            max = b;
        else
            max = c;

        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
    }
}
