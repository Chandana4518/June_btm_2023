class Owner
{
	String ownerName;
	long income;
	int property;
	boolean car;
	String place;
	
	Owner(String ownerName,long income,int property,boolean car,String place)
	{
		System.out.println("Running String,long,int,boolean,String Consts in Owner");
		this.ownerName=ownerName;
		this.income=income;
		this.property=property;
		this.car=car;
		this.place=place;
	}
	void printInstanceVariables()
	{
		System.out.println("OwnerName :"+ownerName);
		System.out.println("Income :"+income);
		System.out.println("Property :"+property);
		System.out.println("Car :"+car);
		System.out.println("Place :"+place);
	}
}
		
	
	