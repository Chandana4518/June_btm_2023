class Scissors
{
	String brand="Ultra Sharp";
	String color="Green";
	String type="Tailors";
	String usage="Cutting";
	char size=2;
	double price=60;
	String material="Steel";
	
	Scissors()
	{
		System.out.println("Running Const in scissors");
	}
	Scissors(String brand)
	{
		System.out.println("Running String Const in Scissors "+brand);
		this.brand=brand;
	}
	Scissors(char size)
	{
		System.out.println("Running char const in Scissors "+size);
		this.size=size;
	}
	Scissors(double price)
	{
		System.out.println("Runninng double const in Scissors "+price);
		this.price=price;
	}
	Scissors(String color,char size)
	{
		System.out.println("Running String,Char Const in Scissors");
		this.color=color;
		this.size=size;
	}
	Scissors(String type,double price)
	{
		System.out.println("Running String,double Const in Scissors");
		this.type=type;
		this.price=price;
	}
	Scissors(String usage,String color,double price)
	{
		System.out.println("Running String,String,double Const in Scissors");
		this.usage=usage;
		this.price=price;
		this.color=color;
	}
}
		