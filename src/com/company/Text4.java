package com.company;
import java.util.Scanner;
import java.text.*;
public class Text4 {
    public static void main(String[] args)
    {
		DecimalFormat bf=new DecimalFormat("#,###.##");
        Scanner kb = new Scanner(System.in);
        double x,commiss,total;

        System.out.print(" input Sales: ");
        x = kb.nextDouble();
        System.out.print("\n");
		if(x>2000)
		{
			commiss=x*12/100;
		}
        else if(x>=1001)
		{
			commiss=x*10/100;
		}
		else if(x>=201)
		{
			commiss=x*8/100;
		}
		else
		{
			commiss=x*5/100;
		}
        
		System.out.print("\n commiss= "+commiss);
		total=x-commiss;
		System.out.print("\n Total All= "+total);
		System.out.print("\n \n");
        System.out.println("KWANJAI Chaiwsuwan");
 
    }
}
