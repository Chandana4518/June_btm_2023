class OwnerRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Owner owner=new Owner("Raj",500000,100,true,"Maharastra");
		owner.printInstanceVariables();
		System.out.println("Updated variables");
		owner.ownerName="Krish";
		owner.income=400000;
		owner.property=50;
		owner.car=false;
		owner.place="Pune";
		owner.printInstanceVariables();
	}
}
