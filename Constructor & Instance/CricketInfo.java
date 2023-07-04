class CricketInfo
{
	String captain="Rohit Sharma";
	int noOfPlayers=11;
	String venue="Chinnaswamy";
	
	CricketInfo()
	{
		System.out.println("Running Const in cricketinfo");
	}
	CricketInfo(String captain)
	{
		System.out.println("Running String Const in CricketInfo "+captain);
		this.captain=captain;
	}
	CricketInfo(int noOfPlayers)
	{
		System.out.println("Running int Const in CricketInfo s"+noOfPlayers);
		this.noOfPlayers=noOfPlayers;
	}
}
	
	