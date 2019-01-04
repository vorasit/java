package com.company;
import java.util.Scanner;
class Testif02 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int x;
		System.out.print("Input x : ");x=kb.nextInt();
		if(x>0) {
			System.out.println("is positive");
		}
		else if (x<0){
			System.out.println("is negative");	
		}
		else{
			System.out.println("is Zero");
		}
		
	}//main
}//class

