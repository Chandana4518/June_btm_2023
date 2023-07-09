class Worker
{
	String workerName;
	int workingHours;
	String workingStatus;
	String workingLocation;
	int salary;
	
	Worker(String workerName,int workingHours,String workingStatus,String workingLocation,int salary)
	{
		System.out.println("Running String,int,String,String,int Consts in Worker");
		this.workerName=workerName;
		this.workingHours=workingHours;
		this.workingStatus=workingStatus;
		this.workingLocation=workingLocation;
		this.salary=salary;
	}
	void printInstanceVariables()
	{
		System.out.println("WorkerName :"+workerName);
		System.out.println("WorkingHours :"+workingHours);
		System.out.println("WorkingStatus :"+workingStatus);
		System.out.println("WorkingLocation :"+workingLocation);
		System.out.println("Salary :"+salary);
	}
}