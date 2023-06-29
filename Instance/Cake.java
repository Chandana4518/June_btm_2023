class Cake{
	String color="White";
	String flavour;
	int price;
	double weight=2;
	Cake()
	{
		System.out.println("Flavour of this Cake is chocolate");
	}
}
class CakeRunner{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Cake sugar=new Cake();
		System.out.println(sugar.color);
		System.out.println(sugar.flavour);
		System.out.println(sugar.price);
		System.out.println(sugar.weight);
	}
}
	