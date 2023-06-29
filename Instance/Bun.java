class Bun{
	int proteins=9;
	double fat;
	boolean creamBun=true;
	int sodium;
	Bun()
	{
		System.out.println("Bun is useful for kidney functions");
	}
}
class BunRunner{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Bun bun=new Bun();
		System.out.println(bun.proteins);
		Bun energy=new Bun();
		System.out.println(energy.fat);
		Bun sugar=new Bun();
		System.out.println(sugar.creamBun);
		Bun fibre=new Bun();
		System.out.println(fibre.sodium);
	}
}