class Kabab
{
	String name;
	double price=100;
	String hotelName="Udupi";
	int noOfPieces=20;
	boolean takeAway;
	Kabab()
	{
		System.out.println("Running const in Kabab");
	}
	Kabab(String name)
	{
		System.out.println("Running String const in Kabab "+name);
		this.name=name;
	}
	Kabab(double price)
	{
		System.out.println("Running double const in Kabab "+price);
		this.price=price;
	}
	Kabab(String hotelName,int noOfPieces)
	{
		System.out.println("Runnning String,int Const in Kabab");
		this.hotelName=hotelName;
		this.noOfPieces=noOfPieces;
	}
	Kabab(boolean takeAway)
	{
		System.out.println("Running boolean Const in Kabab "+takeAway);
		this.takeAway=takeAway;
	}
}