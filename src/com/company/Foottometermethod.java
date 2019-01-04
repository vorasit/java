public class Foottometermethod {
    public static void main(String[] args)
    {
        new Foottometermethod().process(5);
        
    }
	void process(int foot)
	{
		double meter = foot * 0.3048;
        System.out.println(foot+" footer"+"="+meter+" meter");
        System.out.println("vorasit phusuwan");
	}
}
