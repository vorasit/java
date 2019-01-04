import java.util.Scanner;
public class Littogallonmethod2 {
    public static void main(String[] args)
    {
        new Littogallonmethod2().input();
        
    }
	void input()
	{
		Scanner sc = new Scanner(System.in);
		int liter;
        System.out.print("input liter : ");
        liter = sc.nextInt();
		process(liter);
	}
	void process(int liter)
	{
		double gallon = (liter * 0.22);
        System.out.println(liter+"liter"+" = "+gallon+"gallon");
        System.out.println("vorasit phusuwan");
	}
}
