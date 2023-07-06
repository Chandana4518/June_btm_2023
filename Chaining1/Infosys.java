class Infosys
{
	String founderName;
	String founderWifeName;
	int founded;
	long noOfEmployees;
	
	Infosys()
	{
		System.out.println("Running no-args Cconst in Infosys");
	}
	Infosys(String founderName)
	{
		System.out.println("Running String Const in Infosys");
		this.founderName=founderName;
	}
	Infosys(String founderName,String founderWifeName,int founded)
	{
		this(founderName);
		System.out.println("Running String,String,int Const in Infosys");
		this.founderWifeName=founderWifeName;
		this.founded=founded;
	}
	Infosys(String founderName,String founderWifeName,int founded,long noOfEmployees)
	{
		this(founderName,founderWifeName,founded);
		System.out.println("Running String,String,int,long Const in Infosys");
		this.noOfEmployees=noOfEmployees;
	}
}
	