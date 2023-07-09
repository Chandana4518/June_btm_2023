class OilRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Oil oil=new Oil("Power Generation","Furnance Oil","Shell",4,100);
		oil.printInstanceVariables();
		System.out.println("Updated Variables");
		oil.use="Motor";
		oil.name="Marine";
		oil.brand="Chevron";
		oil.noOfOilTypes=5;
		oil.price=150;
		oil.printInstanceVariables();
	}
}