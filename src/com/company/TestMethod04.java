class  TestMethod04
{
	public static void main(String[] args) 
	{
		new TestMethod04().xxx();

	}
	void line(int n,String sym)
	{
		for(int i=1;i<=n;i++)
		System.out.print(sym);
	System.out.println(""+n);
	}
	void xxx()
	{
		line(20,"@");line(30,"#");line(40,"$");
	}

}
