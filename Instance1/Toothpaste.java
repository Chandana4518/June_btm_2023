class Toothpaste
{
	int price;
	String toothpasteName;
	String toothpasteColor;
	String flavour;
	int weight;
	String ingredients;
	int expiryYear;
	int manufactureYear;
	
	Toothpaste(int price,String toothpasteName,String toothpasteColor,String flavour,int weight,
	String ingredients,int expiryYear,int manufactureYear)
	{
		System.out.println("Running int,String,String,String,int,String,int,int Consts in Toothpaste");
		this.price=price;
		this.toothpasteName=toothpasteName;
		this.toothpasteColor=toothpasteColor;
		this.flavour=flavour;
		this.weight=weight;
		this.ingredients=ingredients;
		this.expiryYear=expiryYear;
		this.manufactureYear=manufactureYear;
	}
}