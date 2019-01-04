package com.company;
import java.util.Scanner;
class  FOR2
{
	public static void main(String[] args) 
	{
		int n=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("input n : ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if((i % 3)==0 || (i % 5)==0)//
			{
				sum=sum+i;//
			}
		}
		System.out.print("sum = "+sum);
	}
}
