package com.company;

import java.util.Scanner;

public class Grade {
    public static void main(String arg[]) {
        int score;
        Scanner scan = new Scanner(System.in);
        System.out.print("input score ");
        score = scan.nextInt();
        System.out.print("\n");
        if (score >= 80) {
            System.out.print("เกรด 4 ");
        }

        else if (score >= 75){
            System.out.print("เกรด 3.5");
        }
        else if (score >= 70){
            System.out.print("เกรด 3");
        }
        else if (score >= 65){
            System.out.print("เกรด2.5");
        }
        else if (score >= 60){
            System.out.print("เกรด 2");
        }
        else if (score >= 55){
            System.out.print("เกรด 1.5");
        }
        else if (score >= 50){
            System.out.print("เกรด 1");
        }
        else {
            System.out.print("ไม่ผ่าน");
        }


    }
}
