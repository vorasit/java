package com.company;
import java.util.Scanner;
import java.text.*;
public class Metertoyard {
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner sc = new Scanner(System.in);
        double meter;
        double yard;
        System.out.print("ป้อนเมตร : ");
        meter = sc.nextDouble();
        System.out.print("\n");
        yard = meter * 1.0936;
        System.out.println(meter+"เมตร"+""+df.format(yard)+"หลา");
        System.out.println("นาย วรศิษฏ์ ภู่สุวรรณ์");
        //ข้อ 6
    }
}
