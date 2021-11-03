class Bank
{
	public static void main (String[] args)
	{
		 Bank manager = new Bank();
		int r1 = manager.calculateinterst(1000);
		int r2 = manager.calculateinterst(1000,2);
		String r3= manager.calculateinterst(1000,"balz");
		String r4 = manager.calculateinterst("ba");
		 

		 System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		 }
		
	
	
	public int calculateinterst (int amount)
	{
			int v = amount*3;
			return v;
	}	
	
	public int calculateinterst (int amount, int a)
	{
			int v= amount*a;
			return v;
	}	
	
	public String calculateinterst (int amount, String a1)
	{
			int v= amount;
			String a2 = a1;
			return a2;
	}	
	
	public String calculateinterst (String a3)
	{
		    String a4 = a3;
			return a4;
	}	
	

}