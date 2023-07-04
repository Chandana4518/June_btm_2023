class IceCream{
	String flavour="Buttorscuott";
	int noOfFlavours=10;
	boolean sweet;
	boolean melting;
	IceCream()
	{
		System.out.println("IceCream can boost your immune");
	}
}
class IceCreamRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		IceCream iceCream=new IceCream();
		System.out.println(iceCream.flavour);
		System.out.println(iceCream.noOfFlavours);
		System.out.println(iceCream.sweet);
		System.out.println(iceCream.melting);
	}
}