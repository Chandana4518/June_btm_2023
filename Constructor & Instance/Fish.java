class Fish
{
	String name="Sword Fish";
	String type="Tuna";
	int price=200;
	String location="Island";
	
	Fish()
	{
		System.out.println("Running in Fish...");
	}
	Fish(String name)
	{
		System.out.println("Running String const in Fish " +name);
		this.name=name;
	}
	Fish(int price)
	{
		System.out.println("Running int const in Fish "+price);
		this.price=price;
	}
	Fish(String type,int price)
	{
		System.out.println("Running String,int const in Fish");
		this.type=type;
		this.price=price;
	}
}







