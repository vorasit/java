import java.util.Scanner;
import java.text.*;
class TestArray3_2
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int score[] = new int[10];
		int size = score.length;
		for(int i=0;i<size;i++)
		{ 
			System.out.print("score[" +i+ "] : ");
			score[i]=kb.nextInt();
		}//for
			System.out.println("------------------------------------------------");
		
		double sum=0,avg=0;
		for(int i=0;i<size;i++)
		 {
			int x =score[i];
			
			if(x >= 10)
			 {
				System.out.println("score[" +i+ "] : "+x);	
				sum=(sum+=x);
			 }//if
						 
		 }//for
			System.out.println("------------------------------------------------");
			avg=sum/10;
			System.out.println("avg "+avg);	
			System.out.println("------------------------------------------------");
			for(int i=0;i<size;i++)
			{
				int x =score[i];
			
				if(x >= avg)
				 {
					System.out.println("score[" +i+ "] : "+x);						
				 }//if
						 
			}//for

			System.out.println("------------------------------------------------");
			System.out.println("KWANJAI  CHAIWSUWAN");
	}//main
}//class
