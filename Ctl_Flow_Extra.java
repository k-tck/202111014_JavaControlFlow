//Extra features
package com.ken;

import java.util.Scanner;

public class Ctl_Flow_Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ticket at $7, pls enter age: ");
        float toPay;
        int tix = 7;
        double adultPay;
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
            System.out.println("Normal price $7, how many do you want? (30% discount for 2 or more)");
            int adultTix = Integer.parseInt(scanner.nextLine());
            if (adultTix >= 2) {
                adultPay = (adultTix * tix) * 0.7;
                double round = Math.round(adultPay * 100.0) / 100.0;
                System.out.println("Pls pay $" + round + " for " + adultTix + " tickets.");
                return;
            }
            else if (adultTix == 1){
                System.out.println("Normal price at $7");
                return;
            }
            else{
                System.out.println("Invalid entry");
                return;
            }
        }
    }
}
