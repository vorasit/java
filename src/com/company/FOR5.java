package com.company;
import java.util.Scanner;
class FOR5 
{
	public static void main(String[] args) 
	{
		int r=0,sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("input r : ");
		r = sc.nextInt();

		for(int i=r;i>0;i--)
		{
			if(i==0) {
				break;
			}
			else {
				System.out.print(i + " * ");
				sum = sum * i;
			}
		}
		System.out.println(" = "+sum);
	}
}
