class CricketInfoRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		CricketInfo cricketInfo=new CricketInfo();
		System.out.println(cricketInfo.captain);
		System.out.println(cricketInfo.noOfPlayers);
		System.out.println(cricketInfo.venue);
		CricketInfo player=new CricketInfo("Smith");
		System.out.println(player.captain);
		System.out.println(player.noOfPlayers);
		System.out.println(player.venue);
		CricketInfo team=new CricketInfo(15);
		System.out.println(team.captain);
		System.out.println(team.noOfPlayers);
		System.out.println(team.venue);
	}
}