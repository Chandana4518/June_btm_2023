class ScissorsRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Scissors scissors=new Scissors();
		System.out.println(scissors.brand);
		System.out.println(scissors.color);
		System.out.println(scissors.type);
		System.out.println(scissors.usage);
		System.out.println(scissors.size);
		System.out.println(scissors.material);
		System.out.println(scissors.price);
		
		Scissors sharp=new Scissors();
		System.out.println(sharp.brand);
		System.out.println(sharp.color);
		System.out.println(sharp.type);
		System.out.println(sharp.usage);
		System.out.println(sharp.size);
		System.out.println(sharp.material);
		System.out.println(sharp.price);
		
		Scissors edge=new Scissors(6);
		System.out.println(edge.brand);
		System.out.println(edge.color);
		System.out.println(edge.type);
		System.out.println(edge.usage);
		System.out.println(edge.size);
		System.out.println(edge.material);
		System.out.println(edge.price);
		
		Scissors fabric=new Scissors(50);
		System.out.println(fabric.brand);
		System.out.println(fabric.color);
		System.out.println(fabric.type);
		System.out.println(fabric.usage);
		System.out.println(fabric.size);
		System.out.println(fabric.material);
		System.out.println(fabric.price);
		
		Scissors steel=new Scissors("Orange",4);
		System.out.println(steel.brand);
		System.out.println(steel.color);
		System.out.println(steel.type);
		System.out.println(steel.usage);
		System.out.println(steel.size);
		System.out.println(steel.material);
		System.out.println(steel.price);
		
		Scissors handCraft=new Scissors("Kitchen",70);
		System.out.println(handCraft.brand);
		System.out.println(handCraft.color);
		System.out.println(handCraft.type);
		System.out.println(handCraft.usage);
		System.out.println(handCraft.size);
		System.out.println(handCraft.material);
		System.out.println(handCraft.price);
		
		Scissors cut=new Scissors();
		System.out.println(cut.brand);
		System.out.println(cut.color);
		System.out.println(cut.type);
		System.out.println(cut.usage);
		System.out.println(cut.size);
		System.out.println(cut.material);
		System.out.println(cut.price);
	}
}
		
		
		
		
		