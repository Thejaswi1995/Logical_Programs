package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int f = 0;
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the nth term");
            int n = sc.nextInt();
            System.out.println("The fibonacci of the "+n+" term is :-");
            while(f<=n)
        {
            System.out.println(f+ " ");
            a=b;
            b=f;
            f=a+b;

        }


    }
}
