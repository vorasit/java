package com.company;
class TestArray3
	{
	public static void main(String[] args)
		{
		int score[]={32,50,75,66,82};
		int size=score.length;
		int summ=0;
		double avg;
		for(int i=0;i<size;i++)
		{
			System.out.println("score["+i+"]"+score[i]);
			summ=summ+score[i];
		}//for
		avg=summ/size;
		System.out.println("Average="+avg);
		System.out.print("vorasit phusuwan");
	}//main
}//class