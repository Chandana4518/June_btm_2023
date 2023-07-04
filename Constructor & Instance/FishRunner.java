class FishRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Fish fish=new Fish();
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.location);
		Fish seaFish=new Fish("SwornFish");
		System.out.println(seaFish.name);
		System.out.println(seaFish.type);
		System.out.println(seaFish.price);
		System.out.println(seaFish.location);
		Fish sword=new Fish(500);
		System.out.println(sword.name);
		System.out.println(sword.type);
		System.out.println(sword.price);
		System.out.println(sword.location);
		Fish ref=new Fish("Tuna",400);
		System.out.println(ref.name);
		System.out.println(ref.location);
		System.out.println(ref.type);
		System.out.println(ref.price);
	}
}
		