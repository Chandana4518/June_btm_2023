class FireExtinguisher
{
	String type;
	String brand;
	int manufacture;
	int price;
	String use;
	
	 FireExtinguisher(String type,String brand,int manufacture,int price,String use)
	 {
		 System.out.println("Running String,String,int,int,String consts in FireExtinguisher");
		 this.type=type;
		 this.brand=brand;
		 this.manufacture=manufacture;
		 this.price=price;
		 this.use=use;
	 }
	 void printInstanceVariables()
	 {
		 System.out.println("Type :"+type);
		 System.out.println("brand :"+brand);
		 System.out.println("manufacture :"+manufacture);
		 System.out.println("price :"+price);
		 System.out.println("use :"+use);
	 }
}
	