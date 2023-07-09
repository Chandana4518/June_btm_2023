class FireExtinguisherRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		FireExtinguisher fireExtinguisher=new FireExtinguisher("Foam","Amerex",6,1500,"Fire");
		fireExtinguisher.printInstanceVariables();
		System.out.println("Updated Variables");
		fireExtinguisher.type="Water";
		fireExtinguisher.brand="EZ Fire spray";
		fireExtinguisher.manufacture=5;
		fireExtinguisher.price=2000;
		fireExtinguisher.use="Sweeping";
		fireExtinguisher.printInstanceVariables();
	}
}