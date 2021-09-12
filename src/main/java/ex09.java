/*
    UCF COP3330 Fall 2021 Assignment 9 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex09 {

    // Gallon Coverage
    static int gallonCoverage = 350;

    public static void main(String[] args) {

        // Variables / Objects
        Scanner readDim = new Scanner(System.in);
        String lengthStr, widthStr;
        int gallonAmt;

        System.out.print("What is the length of the room? ");
        lengthStr = readDim.nextLine();
        int length = Integer.parseInt(lengthStr);

        System.out.print("What is the width of the room?" );
        widthStr = readDim.nextLine();
        int width = Integer.parseInt(widthStr);

        // Calculations
        int area = length * width;
        if (area % gallonCoverage == 0)
            gallonAmt = area/gallonCoverage;
        else
            gallonAmt = area/gallonCoverage + 1;

        // Output
        System.out.print("You will need to purchase " + gallonAmt + " gallons of paint to cover " + area + " square feet.");
    }
}
