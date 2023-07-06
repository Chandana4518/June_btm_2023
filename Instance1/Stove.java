class Stove
{
	String fuelType;
	int noOfBurners;
	int capacity;
	int price;
	double length;
	double width;
	double weight;
	boolean electricStove;
	
	Stove(String fuelType,int noOfBurners,int capacity,int price,double length,double width,
	double weight,boolean electricStove)
	{
		System.out.println("Running String,int,int,int,double,double,double,boolean Consts in Stove");
		this.fuelType=fuelType;
		this.noOfBurners=noOfBurners;
		this.capacity=capacity;
		this.price=price;
		this.length=length;
		this.width=width;
		this.weight=weight;
		this.electricStove=electricStove;
	}
}