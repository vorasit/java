package com.company;
import java.util.Scanner;
import java.text.*;
public class TextTwo {
    public static void main(String[] args)
    {
		DecimalFormat bf=new DecimalFormat("#,###.##");
        Scanner kb = new Scanner(System.in);
        double x;

        System.out.print(" input X: ");
        x = kb.nextDouble();
        System.out.print("\n");
		if(x==0)
		{
			System.out.println("is Zero");
		}
        else if(x<0)
		{
			System.out.println("is negative");
		}
		else
		{
			System.out.println("is positive");
		}
        
		System.out.print("\n \n");
        System.out.println("KWANJAI Chaiwsuwan");
 
    }
}
