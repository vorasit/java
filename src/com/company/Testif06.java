package com.company;
import java.util.Scanner;
class Testif06 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		double hour,hourrate,moneypay,discount=0,netpay;
		System.out.print("Input hour : ");hour=kb.nextInt();
		if(hour>10) 
				hourrate=10;
		else if(hour>=6) 
					hourrate=12;
		else if(hour>=3) 
					hourrate=15;
		else
			 hourrate=20;
		moneypay=hour*hourrate;
		if(hour>5)
			 discount = moneypay*5/100;
			netpay=moneypay-discount;
	

			System.out.println("mounepay= "+moneypay);
			System.out.println("discount= "+discount);
			System.out.println("netpay= "+netpay);
			System.out.println("SUPAVINEE");
		
		
	}//main
}//class

