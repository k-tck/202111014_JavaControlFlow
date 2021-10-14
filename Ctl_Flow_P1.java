// Part 1: Commission Calculator

package com.ken;

import java.util.Scanner;

public class Ctl_Flow_P1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sales figure: $");
        float salesRange = Float.parseFloat(scanner.nextLine());

        if (salesRange >= 10000) {
            float comm = salesRange * 0.3f;
            System.out.println("You have earn $" + comm + " for $" + salesRange + " of sales made!");
            return;
        }
        else if (salesRange >= 5000 && salesRange <= 9999){
            float comm = salesRange * 0.2f;
            System.out.println("You have earn $" + comm + " for $" + salesRange + " of sales made!");
            return;
        }
        else if (salesRange >= 1000 && salesRange <= 4999) {
            float comm = salesRange * 0.1f;
            System.out.println("You have earn $" + comm + " for $" + salesRange + " of sales made!");
            return;
        }
        else {
            System.out.println("Sorry, no commission for $" + salesRange + " of sales made!");
        }
    }
}
