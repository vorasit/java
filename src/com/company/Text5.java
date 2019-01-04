package com.company;
import java.util.Scanner;
import java.text.*;
public class Text5 {
    public static void main(String[] args)
    {
		DecimalFormat bf=new DecimalFormat("#,###.##");
        Scanner kb = new Scanner(System.in);
        double Money,insurance=0,total;

        System.out.print(" input Money: ");
        Money = kb.nextDouble();
        System.out.print("\n");
		if(Money>100000)
		{
			System.out.println("Not approved for loan");
			
			
		}
        else if(Money>=50000)
		{
			insurance=5000+(Money-50000)*25/100;
			System.out.println("\n insurance= "+insurance);
			total=Money-insurance;
			System.out.print("\n total= "+total);
		}
		else if(Money>=25000)
		{
			insurance=1250+(Money-25000)*10/100;
			System.out.println("\n insurance= "+insurance);
			total=Money-insurance;
			System.out.print("\n total= "+total);
		}
		else
		{
			insurance=Money*5/100;
			System.out.println("\n insurance= "+insurance);
			total=Money-insurance;
			System.out.print("\n total= "+total);
		}
        

		System.out.println("\n \n");
        System.out.println("KWANJAI Chaiwsuwan");
 
    }
}
