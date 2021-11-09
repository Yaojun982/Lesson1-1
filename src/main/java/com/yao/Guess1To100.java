package com.yao;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        System.out.println("Numer:" + min + "-" + max);
        System.out.println("Enter a number:");

        for (int i = 0; i < 3; i= i+1)        //單次迴圈
        {
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
                }
            }
        }
        System.out.println("87940");
    }
}
