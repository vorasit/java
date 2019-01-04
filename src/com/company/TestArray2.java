package com.company;
import java.util.Scanner;
class TestArray2{
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		String name[]=new String[5];
		int size=name.length;
		for(int i=0;i<size;i++)
		{
			System.out.print("input name["+i+"];");name[i]=kb.next();
		}
		for(int j=0;j<size;j++)
			System.out.println("name ["+j+"]="+name[j]);
		System.out.print("vorasit phusuwan");
	}//main
}//class