class Pot
{
	
	int price;
	boolean inGoodCondition;
	int height;
	int durability;
	String material;
	String use;
	String color;
	int volume;
	
	
	Pot(int price,boolean inGoodConndition,int height,int durability,String material,String use,
	String color,int volume)
	{
		System.out.println("Running String,int,int,boolean,String,String,String,int");
		
		this.price=price;
		this.inGoodCondition=inGoodCondition;
		this.height=height;
	    this.durability=durability;
	    this.material=material;
		this.use=use;
		this.color=color;
		this.volume=volume;
	}
}