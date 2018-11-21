package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.000000");
        Scanner sc = new Scanner(System.in);
        float w, m, bmi;
        System.out.print("weight");
        w = sc.nextFloat();
        System.out.print("\n");
        System.out.print("height");
        m = sc.nextFloat();
        bmi = w/(m*m);
        System.out.print("bmi = " + df.format(bmi));
    }

}
