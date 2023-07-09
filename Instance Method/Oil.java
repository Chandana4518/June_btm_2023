class Oil
{
	String use;
	String name;
	String brand;
	int noOfOilTypes;
	int price;
	
	Oil(String use,String name,String brand,int noOfOilTypes,int price)
	{
		System.out.println("Runnin String,String,String,int,int Consts in Oil");
		this.use=use;
		this.name=name;
		this.brand=brand;
		this.noOfOilTypes=noOfOilTypes;
		this.price=price;
	}
	void printInstanceVariables()
	{
		System.out.println("Use :"+use);
		System.out.println("Name :"+name);
		System.out.println("Brand :"+brand);
		System.out.println("NoOfOilTypes :"+noOfOilTypes);
		System.out.println("Price :"+price);
	}
}
		
	