import java.util.Scanner;

class TestArray3_5
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int num[]=new int[10];
		int size=num.length;
		int max=0,min=0,sum=0;
		double avg=0;
		for(int i=0;i<size;i++)
		{
			System.out.print("input num no.["+i+"] : ");
			num[i]=kb.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			System.out.print(num[i]+"\t");
			sum=sum+num[i];
			if(num[i]>max){
				max=num[i];
			}
			else if(num[i]<min){
				min=num[i];
			}
		}

			System.out.println("max :"+max);
			System.out.println("min :"+min);
			avg=sum/10;
			System.out.println("avg :"+avg);

			System.out.println("vorasit phusuwan");
	}

}
