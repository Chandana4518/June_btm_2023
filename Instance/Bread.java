class Bread{
	String vitamins;
	String flavour;
	boolean creamBread=true;
	int packOfBreads=10;
	Bread()
	{
		System.out.println("Quality of the bread is takes to consideration");
	}
}
class BreadRunner{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Bread bread=new Bread();
		System.out.println(bread.vitamins);
		System.out.println(bread.flavour);
		System.out.println(bread.creamBread);
		System.out.println(bread.packOfBreads);
	}
}