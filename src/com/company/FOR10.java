package com.company;
import java.util.Scanner;
class  FOR10
{
	public static void main(String[] args) 
	{
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("input n : ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
		System.out.print("\n");
		}
	}
}
