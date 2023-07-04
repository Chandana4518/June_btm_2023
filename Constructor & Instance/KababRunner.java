class KababRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Kabab kabab=new Kabab();
		System.out.println(kabab.name);
		System.out.println(kabab.price);
		System.out.println(kabab.hotelName);
		System.out.println(kabab.noOfPieces);
		System.out.println(kabab.takeAway);
		Kabab spicy=new Kabab("Chicken Kabab");
		System.out.println(spicy.name);
		System.out.println(spicy.price);
		System.out.println(spicy.hotelName);
		System.out.println(spicy.noOfPieces);
		System.out.println(spicy.takeAway);
		Kabab juicy=new Kabab(200);
		System.out.println(juicy.name);
		System.out.println(juicy.price);
		System.out.println(juicy.hotelName);
		System.out.println(juicy.noOfPieces);
		System.out.println(juicy.takeAway);
		Kabab delicious=new Kabab("Pearl Hotel",10);
		System.out.println(delicious.name);
		System.out.println(delicious.price);
		System.out.println(delicious.hotelName);
		System.out.println(delicious.noOfPieces);
		System.out.println(delicious.takeAway);
		Kabab tasty=new Kabab(true);
		System.out.println(tasty.name);
		System.out.println(tasty.price);
		System.out.println(tasty.hotelName);
		System.out.println(tasty.noOfPieces);
		System.out.println(tasty.takeAway);
	}
}