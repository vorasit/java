
import java.util.Scanner;
public class Metertoyard {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int meter;
        double yard;
        System.out.print("input meter : ");
        meter = sc.nextInt();
        System.out.print("\n");
        yard = meter * 1.0936;
         System.out.println(meter+" Meter"+"="+yard+" yard");
        System.out.println("vorasit phusuwan");

    }
}
