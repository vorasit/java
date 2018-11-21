package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Foottometer {
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner sc = new Scanner(System.in);
        double foot ;
        double meter;
        System.out.print("รับฟุต : ");
        foot = sc.nextDouble();
        System.out.println("");
        meter = foot * 0.3048;
        System.out.println(foot+"ฟุต"+""+df.format(meter)+"เมตร");
        System.out.println("นาย วรศิษฏ์ ภู่สุวรรณ์");
        //ข้อ 5

    }
}
