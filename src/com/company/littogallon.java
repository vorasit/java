
import java.util.Scanner;
public class littogallon {
    public static void main(String[] args)
    {
        int liter;
        double gallon ;
        Scanner sc = new Scanner(System.in);
        System.out.print("input liter : ");
        liter = sc.nextInt();
        System.out.print("\n");
        gallon = liter * 0.22;
		System.out.println(liter+"liter"+" = "+gallon+"gallon");
        System.out.println("vorasit phusuwan");

    }
}
