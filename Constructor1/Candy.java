class Candy
{
	boolean chewy=true;
	String flavour;
	String company;
	int typesOfCandy=20;
	Candy()
	{
		System.out.println("I want a piece of candy");
	}
}
class CandyRunner{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Candy candy=new Candy();
		System.out.println(candy.chewy);
		System.out.println(candy.flavour);
		System.out.println(candy.company);
		System.out.println(candy.typesOfCandy);
	}
}