public class Metertoyardmethod {
    public static void main(String[] args)
    {
        new Metertoyardmethod().process(10);

    }
	void process(int meter)
	{
		double yard = meter * 1.0936;
        System.out.println(meter+" Meter"+" = "+yard+" yard");
        System.out.println("vorasit phusuwan");
	}
}
