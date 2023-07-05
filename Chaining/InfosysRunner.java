class InfosysRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Infosys infosys=new Infosys("N.R.Narayana Murthi","Sudha Murthy",1981,300000);
		System.out.println("FounderName :"+infosys.founderName);
		System.out.println("FounderWifeName :"+infosys.founderWifeName);
		System.out.println("Founded :"+infosys.founded);
		System.out.println("NoOfEmployees :"+infosys.noOfEmployees);
	}
}
		