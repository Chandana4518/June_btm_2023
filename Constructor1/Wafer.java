class Wafer{
	double waferRange=0.10;
	boolean lowSugar=true;
	int typesOfWafer;
	String flavour;
	Wafer()
	{
		System.out.println("Wafer is a crispy");
	}
}
class WaferRunner{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Wafer wafer=new Wafer();
		System.out.println(wafer.waferRange);
		System.out.println(wafer.lowSugar);
		System.out.println(wafer.typesOfWafer);
		System.out.println(wafer.flavour);
	}
}