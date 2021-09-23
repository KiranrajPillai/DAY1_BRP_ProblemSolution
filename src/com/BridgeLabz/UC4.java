package com.BridgeLabz;

import java.util.Scanner;

public class UC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
        int mon = sc.nextInt();
        System.out.println("Enter the Date:");
        int date = sc.nextInt();
        if (mon < 3 || date>=20 && mon > 6 || date<=20)
        {
            System.out.println("Its is not a Spring Season");
        }
        else if (mon >= 3 && mon <= 6 && date<31)
        {
            System.out.println("Its is a Spring Season");
        }
    }
}
