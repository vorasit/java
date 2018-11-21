package com.company;
import java.util.Scanner;
import java.text.*;
public class CeltoFar {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        double cel,far;
        System.out.print("รับค่า องศาเเซลเซียส : ");cel = kb.nextDouble();
        far = (9*cel/5)-32;
        System.out.print("\n");
        System.out.println(cel+"celsius"+" = "+df.format(far)+"fahrenheit");
        System.out.println("นาย วรศิษฏ์ ภู่สุวรรณ์");
        //ข้อ 1


    }
}
