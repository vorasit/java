import java.util.Scanner;
class TestArray3_4 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int num[]=new int[10];
		int size=num.length;
		int v=0;
			System.out.print("input v : ");
			v=kb.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.print("input num no.["+i+"] : ");
			num[i]=kb.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(num[i]==v)
			{
				System.out.println(num[i]+"  v is in the array");
			}
			else
			{
				System.out.println(num[i]+"  v is not in the array");
			}
		}
			System.out.println("vorasit phusuwan");

	}
}
