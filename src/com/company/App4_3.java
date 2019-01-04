package com.company;
import java.util.Scanner;
import java.text.*;
public class App4_3 {
    public static void main(String[] args)
    {
		DecimalFormat bf=new DecimalFormat("#,###.##");
        Scanner kb = new Scanner(System.in);
        float Calls,Internet,Total,service=0,service2=0,x=349,mservice1=0,mservice2=0;

        System.out.print("Calls (minutes): ");
        Calls = kb.nextFloat();
        System.out.print("\n");

		System.out.print("Internet(MB): ");
		Internet = kb.nextFloat();
		System.out.print("\n");

		if(Calls>=200 && Internet>=500)
		{
			service=Calls - 200;
			mservice1 = (service*1.27f);

			service2=Internet - 500;
			mservice2=service2*1.27f;

			System.out.println("Calls (minutes): "+Calls);
			System.out.println("Internet: "+Internet);
			Total=x+mservice1+mservice2;
			System.out.println("Total amount: "+Total);
			System.out.println("\n \n");
			System.out.println("KWANJAI Chaiwsuwan");
		}
		else if ((Calls <=199 && Calls > 0 )&&(Internet <=499 && Internet > 0))
		{
			service= 0;
			service2=0;

			System.out.println("Calls (minutes): "+Calls);
			System.out.println("Internet: "+Internet);
			Total=x+mservice1+mservice2;
			System.out.println("Total amount: "+Total);
			System.out.println("\n \n");
			System.out.println("KWANJAI Chaiwsuwan");
		}
		else {

			System.out.println("ERROR");
		}

 
    }
}
