class Plate
{
	String plateType;
	String shape;
	int price;
	String color;
	double weight;
	int capacity;
	boolean spikyPlate;
	String brand;
	
	Plate(String plateType,String shape,int price,String color,double weight,int capacity,
	boolean spikyPlate,String brand)
	{
		System.out.println("Running String,Strinng,int,String,double,innt,boolean, Consts in Plate");
		this.plateType=plateType;
		this.shape=shape;
		this.price=price;
		this.color=color;
		this.weight=weight;
		this.capacity=capacity;
		this.spikyPlate=spikyPlate;
		this.brand=brand;
	}
}