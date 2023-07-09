class WorkerRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Worker worker=new Worker("Ram",6,"Cashier","Electronic city",15000);
		worker.printInstanceVariables();
		System.out.println("Updated Variables");
		worker.workerName="John";
		worker.workingHours=7;
		worker.workingStatus="Cleaner";
		worker.workingLocation="BTM";
		worker.salary=10000;
		worker.printInstanceVariables();
	}
}