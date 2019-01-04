
import java.util.Scanner;
public class Foottometer {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int foot ;
        double meter;
        System.out.print("footer : ");
        foot = sc.nextInt();
        meter = foot * 0.3048;
        System.out.println(foot+"footer"+"="+meter+"meter");
        System.out.println("vorasit phusuwan");
    }
}
