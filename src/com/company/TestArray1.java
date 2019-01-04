package com.company;
class TestArray1 {
	public static void main(String[] args) 
	{
		String city[]={"Lampang","Chiangmai","chiangrai"};
		int score[]={32,50,75,66,82};
		int size1=score.length;
		int size2=city.length;
		for(int i=0;i<size1;i++)
			System.out.println("score ["+i+"]"+score[i]);
		for(int i=0;i<size2;i++)
			System.out.println("city ["+i+"]"+city[i]);
		System.out.print("vorasit phusuwan");
	}//main
}//class
