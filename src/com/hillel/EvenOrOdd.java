package com.hillel;

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println("This number is even.");
        else
            System.out.println("This number is odd.");
    }
}
