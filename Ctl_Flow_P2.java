//Part 2: Movie Discounts
package com.ken;

import java.util.Scanner;

public class Ctl_Flow_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ticket at $7, pls enter age: ");
        float toPay;
        int tix = 7;
        int ageChk = Integer.parseInt(scanner.nextLine());

        if (ageChk >= 60) {
            toPay = tix * 0.45f;
            double round = Math.round(toPay * 100.0) / 100.0;
            System.out.println("Senior price at $" + round);
            return;
        }
        else if (ageChk <= 5) {
            toPay = tix * 0.4f;
            double round = Math.round(toPay * 100.0) / 100.0;
            System.out.println("Junior price at $" + round);
            return;
        }
        else {
            System.out.println("Adult normal price at $" + tix);
            return;
        }

    }
}
