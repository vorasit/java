import java.util.Scanner;
class  TestMethod03
{
	public static void main(String[] args) 
	{
		
		new TestMethod03().input();
	}
	void multiple(int m)
	{
		//int m=2;
		for(int i=1;i<=12;i++)
		System.out.println(m+"*"+i+"="+m*i);
	}
	void input()
	{
		Scanner kb =new Scanner(System.in);
		int n;
		System.out.print("input n ");
		n=kb.nextInt();
		multiple(n);
	}
}
