class Shop
{
     static String shopname= "super  market";//class specific variable
	 static int doorno= 32;
	 int count;
	 String name;  //object  specific variable-- global variable or field, scope of variable
	 int price , discount;

public static void main(String[] args)//String is class so caps 
   {
	 System.out.println(Shop.shopname);
     System.out.println(Shop.doorno);

	
    Shop product1 = new Shop();
	product1.name= "ball";
	product1.price= 50;
	product1.discount= 5;
	product1.count=10;
	
    Shop product2 = new Shop();
	product2.name= "bat";
	product2.price= 100;
	product2.discount= 10;
	product2.count=15;
	
	
	//product1.display();
	product2.sell();
	product1.update();
	product2.update();
	
   }
 	
	public  void display() //object specific activity
	     {
         System.out.println(name);
         }
	public  void sell() 
	     {
         System.out.println(price-discount);
         }
	public  void update() 
	     {
		 count= count-1;
         System.out.println("balance" + count);
         }
}
