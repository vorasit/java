
import java.util.Scanner;
public class CeltoFar {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int cel,far;
        System.out.print("celsius ");
		cel = kb.nextInt();
        far = (9*cel/5)-32;
        System.out.print("\n");
        System.out.println(cel+"celsius"+" = "+far+"fahrenheit");
        System.out.println("vorasit phusuwan");
		//���1
    }
}
