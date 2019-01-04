import java.util.Scanner;
import java.text.*;
class TestArray5 
{
	public static void main(String[] args) 
	{
		DecimalFormat bf=new DecimalFormat("#,###.###");
		String Name[] ={"Chaiwat","Prayut","Narin"};
		int num1 =Name.length;
		int salary[] = {6000,7000,8000};
		int num2 = salary.length;
	
		double ot,total,tax=0,net=0;
		System.out.println("name\tsalary\tot\ttotal\ttax\tnet");
		for(int i=0;i<num1;i++)
		{
		int y=salary[i];
		ot=(((double)y/30/8)*2)*18;
		total=y+ot;
		if(total>9001){
			tax=total*5/100;}
		else if(total>8001){
			tax=total*4/100;}
		else if(total>7001){
			tax=total*3/100;}
		else if(total>0){
			tax=total*2/100;}

		net=(double)total-tax;
		System.out.println(Name[i]+"\t"+y+"\t"+ot+"\t"+total+"\t"+tax+"\t"+net);
		}
	}
}
