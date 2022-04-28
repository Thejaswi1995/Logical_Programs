package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int count =0;
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : \n");
        int n = s.nextInt();
        for( i=2 ; i<n ; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
            if(count==0)
                System.out.println("\nIt is a Prime Number.");
            else
                System.out.println("\nIt is not a Prime Number.");
        }
    }


