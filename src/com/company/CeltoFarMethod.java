
import java.util.Scanner;
public class CeltoFarMethod {
    public static void main(String[] args)
    {
        new CeltoFarMethod().process(10);
        
    }
	void process(int cel)
	{
		int far = (9*cel/5)-32;
        System.out.print("\n");
        System.out.println(cel+"celsius"+" = "+far+"fahrenheit");
        System.out.println("vorasit phusuwan");
	}
}
