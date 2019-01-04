package com.company;
import java.util.Scanner;
class  FOR3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum=0,n=0,avg=0;
		for(int i=1;i<=5;i++)
		{
		System.out.print("input n : ");
		n = sc.nextInt();
			sum=sum+n;
			
		}
		avg=sum/5;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		System.out.println("vorasit phusuwan");
	}
}
