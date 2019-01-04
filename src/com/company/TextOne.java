package com.company;
import java.util.Scanner;
import java.text.*;
public class TextOne {
    public static void main(String[] args)
    {
		DecimalFormat bf=new DecimalFormat("#,###.##");
        Scanner kb = new Scanner(System.in);
        double x,y,p;
		double t;

        System.out.print(" input X: ");
        x = kb.nextDouble();
		System.out.print(" input Y: ");
        y = kb.nextDouble();
        System.out.print("\n");
        if(x>y)
		{
		  p=x+y;
		  t=x-y;
		}
		else
		{
		  p=x*y;
		  t=x/y;
		}
        System.out.println("P = : "+p);
		System.out.println("T = : "+t);
		System.out.print("\n \n");
        System.out.println("KWANJAI Chaiwsuwan");
 
    }
}
