package com.company;
import java.util.Scanner;
import java.text.*;
public class Text3 {
    public static void main(String[] args)
    {
		DecimalFormat bf=new DecimalFormat("#,###.##");
        Scanner kb = new Scanner(System.in);
        double x,t,n,z,y,a;


        System.out.print(" input X: ");
        x = kb.nextDouble();
        System.out.print("\n");
        if(x>60000)
		{
		  y=x*12;
		  t=(y*15)/100;
		  n=(y*3)/100;
		  //z=12*(t+n);
		  a=y+n-t;
		}
		else
		{
		  y=x*12;
		  t=(y*5)/100;
		  n=(y*3)/100;
		  //z=12*(t+n);
		  a=y+n-t;
		}
		System.out.println("Salary all year = : "+y);
        System.out.println("Net = : "+t);
		System.out.println("Bonus = : "+n);
		//System.out.println("Total = : "+z);
		System.out.println("Total = : "+a);
		System.out.print("\n \n");
        System.out.println("KWANJAI Chaiwsuwan");
 
    }
}
