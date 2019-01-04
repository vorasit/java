import java.util.Scanner;
public class Metertoyardmethod2 {
    public static void main(String[] args)
    {
        new Metertoyardmethod2().input();
    }
	void input()
	{
		Scanner sc = new Scanner(System.in);
		int meter;
		System.out.print("input meter : ");
		meter = sc.nextInt();
		process(meter);
	}
	void process(int meter)
	{
		double yard = meter * 1.0936;
        System.out.println(meter+" Meter"+" = "+yard+" yard");
        System.out.println("vorasit phusuwan");
	}
}
