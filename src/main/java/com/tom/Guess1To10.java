package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess1To10 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);
        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        boolean playgame = true;
        while (playgame) {
            String s = scanner.next();
            System.out.println("user:" + s);
            int num = Integer.parseInt(s);
            if (num > secret) {
                System.out.println("Smaller");
            } else {
                if (num < secret) {
                    System.out.println("Bigger");
                } else {
                    System.out.println("Ok");
                    playgame = false;
                }
            }
        }
        System.out.println("87940");
    }
}