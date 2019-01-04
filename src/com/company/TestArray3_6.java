class TestArray3_6
{
	public static void main(String[] args) 
	{
		int temp=0;
		int x[]={10,9,7,1,2,4,5,6,3,8};
		int list=x.length;
       System.out.println("data before sort");
	   for (int i=0;i<list ;i++ )
	      System.out.print(x[i]+" " );
	   System.out.println(" ");
	//sort
		
		for(int i=0;i<list-1;i++)
		{
			for (int j=0;j<list-1 ;j++ )
			{
			
			if(x[j]>x[j+1])
			{
				temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			}
			}//int j
		}//int i
	    System.out.println("data after sort");
	   for (int i=0;i<list ;i++ )
	      System.out.print(x[i]+" " );
	   System.out.println(" ");
	}//main
}//class
