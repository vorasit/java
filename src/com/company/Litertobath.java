package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Litertobath {
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner sc = new Scanner(System.in);
        double liter;
        double desale=29.39,bus=0.60,bath;
        System.out.print("ป้อนจำนวนลิตร : ");
        liter = sc.nextDouble();
        System.out.print("\n");
        bath = (desale + bus)*liter;
        System.out.println(liter+"ลิตร"+" = "+df.format(bath)+"บาท");
        System.out.println("นาย วรศิษฏ์ ภู่สุวรรณ์");
        //ข้อ 4


    }
}
