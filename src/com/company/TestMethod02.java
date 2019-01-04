class  TestMethod02
{
	public static void main(String[] args) 
	{
		//new TestMethod02().line1();
		//new TestMethod02().hello();
		//new TestMethod02().line2();
		new TestMethod02().xxx();
	}
	void hello()
	{
		//line1();
		System.out.println("Hello World!");
		//line2();
	}
	void line1()
	{
		System.out.println("-------------");
	}
	void line2()
	{
		System.out.println("*************");
	}
	void xxx()
	{
		line1();
		hello();
		line2();
	}
}
