
import java.util.Scanner;
public class CeltoFarMethod2 {
    public static void main(String[] args)
    {
        new CeltoFarMethod2().input();
        
    }
	void input()
	{
		Scanner kb = new Scanner(System.in);
        int cel;
        System.out.print("celsius ");
		cel = kb.nextInt();
		process(cel);
	}
	void process(int cel)
	{
		int far = (9*cel/5)-32;
        System.out.print("\n");
        System.out.println(cel+"celsius"+" = "+far+"fahrenheit");
        System.out.println("vorasit phusuwan");
	}
}
