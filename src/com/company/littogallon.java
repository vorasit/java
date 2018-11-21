package com.company;
import java.util.Scanner;
import java.text.*;
public class littogallon {
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        double liter;
        double gallon ;
        Scanner sc = new Scanner(System.in);
        System.out.print("รับจำนวนลิตร : ");
        liter = sc.nextDouble();
        System.out.print("\n");
        gallon = liter * 0.22;
        System.out.println(liter+"ลิตร"+" = "+df.format(gallon)+"แกลลอน");
        System.out.println("นาย วรศิษฏ์ ภู่สุวรรณ์");
        //ข้อ 2
    }
}
