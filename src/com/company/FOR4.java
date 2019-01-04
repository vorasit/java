package com.company;
import java.util.Scanner;
class  FOR4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum=0,n=0,avg=0,r=0;

		System.out.print("input r : ");
		r = sc.nextInt();

		for(int i=1;i<=r;i++)
		{
		System.out.print("input n : ");
		n = sc.nextInt();
			sum=sum+n;
			
		}
		avg=sum/r;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		System.out.println("vorasit phusuwan");
	}
}
