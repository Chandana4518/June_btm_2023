class MetroRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Metro metro=new Metro("Green",15,"Majestric","Silk Board",15000);
		System.out.println("Line :"+metro.line);
		System.out.println("Distance :"+metro.distance);
		System.out.println("Start :"+metro.start);
		System.out.println("Destination :"+metro.destination);
		System.out.println("Capacity :"+metro.capacity);
	}
}