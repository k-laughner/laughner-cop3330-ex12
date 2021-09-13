/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the principal:");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();

        System.out.println("Enter the annual rate of interest (as a percentage):");
        Scanner input2 = new Scanner(System.in);
        float percent = input2.nextFloat();

        System.out.println("Enter the number of years invested:");
        Scanner input3 = new Scanner(System.in);
        int years = input3.nextInt();

        float rate = percent/100;
        int a = Math.round(p*(1+rate*years));

        System.out.println("After " + years + " years at " + percent+ "%, the investment will be worth $" + a + ".");
    }
}