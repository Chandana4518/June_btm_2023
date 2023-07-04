class Biscuit{
	int weight;
	String color="Skin";
	String thickness;
	String name="Hide&seek";
	Biscuit()
	{
		System.out.println("Hide&seek is my favourite biscuit");
	}
}
class BiscuitMaking{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Biscuit biscuit=new Biscuit();
		System.out.println(biscuit.weight);
		System.out.println(biscuit.color);
		System.out.println(biscuit.thickness);
		System.out.println(biscuit.name);
	}
}