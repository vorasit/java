package com.company;
import java.util.Scanner;
import java.text.*;
public class MiletoKilo {
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner sc = new Scanner(System.in);
        double mile;
        double kilo;
        System.out.print("ป้อนไมล์ : ");
        mile = sc.nextDouble();
        System.out.print("\n");
        kilo = mile * 1.6039;
        System.out.print(mile+"ไมล์"+" = "+df.format(kilo)+"กิโลเมตร");
        System.out.println("นาย วรศิษฏ์ ภู่สุวรรณ์");
        //ข/้อ3

    }
}
