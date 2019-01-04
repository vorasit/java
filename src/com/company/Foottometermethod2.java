import java.util.Scanner;
public class Foottometermethod2 {
    public static void main(String[] args)
    {
        new Foottometermethod2().input();
        
    }
	void input()
	{
		Scanner sc = new Scanner(System.in);
		int foot;
		System.out.print("footer : ");
        foot = sc.nextInt();
		process(foot);
	}
	void process(int foot)
	{
		double meter = foot * 0.3048;
        System.out.println(foot+" footer"+"="+meter+" meter");
        System.out.println("vorasit phusuwan");
	}
}
