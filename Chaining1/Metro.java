class Metro
{
	String line;
	int distance;
	String start;
	String destination;
	long capacity;
	
	Metro()
	{
		System.out.println("Running no-args Const in Metro");
	}
	Metro(String line,int distance)
	{
		System.out.println("Running String,int Const in Metro");
		this.line=line;
		this.distance=distance;
	}
	Metro(String line,int distance,String start)
	{
		this(line,distance);
		System.out.println("Running String,int,string Const in Metro");
		this.start=start;
	}
	Metro(String line,int distance,String start,String destination)
	{
		this(line,distance,start);
		System.out.println("Running String,int,String,String Const in Metro");
		this.destination=destination;
	}
	Metro(String line,int distance,String start,String destination,long capacity)
	{
		this(line,distance,start,destination);
		System.out.println("Running String,int,String,String,long Const in Metro");
		this.capacity=capacity;
	}
}