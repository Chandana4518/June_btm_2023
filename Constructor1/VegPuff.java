class VegPuff{
	boolean crispy;
	String color="Skin";
	boolean tasty=true;
	String madeOf;
	VegPuff()
	{
		System.out.println("VegPuff is very delicious");
	}
}
class Puff{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		VegPuff vegPuff=new VegPuff();
		System.out.println(vegPuff.crispy);
		System.out.println(vegPuff.color);
		System.out.println(vegPuff.tasty);
		System.out.println(vegPuff.madeOf);
	}
}