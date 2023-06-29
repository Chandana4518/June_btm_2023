class Sweet{
	String nutrients;//INSTANCE VARIABLES
	String name="Kaju";
	int noOfSweetTypes=30;
	String vitamins;
	Sweet()
	{
		System.out.println("Sweet Potatos are good for health");
	}
}
class SweetRunner{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Sweet sweet=new Sweet();
		System.out.println(sweet.nutrients);
		System.out.println(sweet.name);
		System.out.println(sweet.noOfSweetTypes);
		System.out.println(sweet.vitamins);
	}
}
		