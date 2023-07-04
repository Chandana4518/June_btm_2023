class Chocolate{
	boolean bloodFlow=true;
	boolean highLevelOfAntioxidants=true;
	String flavour;
	int typesOfChocolates;
	Chocolate()
	{
		System.out.println("Chocolates  stimulates the control nervous system");
	}
}
class ChocolateRunner{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Chocolate chocolate=new Chocolate();
		System.out.println(chocolate.bloodFlow);
		System.out.println(chocolate.highLevelOfAntioxidants);
		System.out.println(chocolate.flavour);
		System.out.println(chocolate.typesOfChocolates);
	}
}