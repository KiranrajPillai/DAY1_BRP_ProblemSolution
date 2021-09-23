package com.BridgeLabz;

import java.util.Scanner;

public class UC3 {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year :");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("The Year Entered is A LEAP YEAR");
        else
            System.out.println("The Year Entered  is NOT A LEAP YEAR");
    }
}
