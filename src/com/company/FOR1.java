package com.company;
import java.util.Scanner;
class  FOR1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum=0,n=0;
        System.out.print("input n : ");
		n = sc.nextInt();
        System.out.print("\n");
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;//บวกกันเรื่อยๆตามค่าตั้งต้นที่รับเข้ามา
			
		}
		
		System.out.println("sum="+sum);
		
		System.out.println("vorasit phusuwan");
	}
}
