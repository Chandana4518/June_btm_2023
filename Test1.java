
1)public class FirstLargestNum{  
    public static void main(String[] args)
	{  
    int a[]={1,2,5,6,3,2};
    int temp;  
    for (int i = 0; i < a.length; i++)   
            {  
                for (int j = i + 1; j < a.length; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
      
     
    System.out.println("Second Largest: "+a[a.length-1]);  
	}
 }  

3)  public class SecondLargestNum{  
    public static void main(String[] args)
	{  
    int a[]={1,2,5,6,3,2};
    int temp;  
    for (int i = 0; i < a.length; i++)   
            {  
                for (int j = i + 1; j < a.length; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
      
     
    System.out.println("Second Largest: "+a[a.length-2]);  
	}
 }  
 
4)class PerfectSquare {
 
    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {
            int a = (int)Math.sqrt(x);
 
            return ((a * a) == x);
        }
        return false;
    }
 
    public static void main(String[] args)
    {
        int x = 25;
 
        if(isPerfectSquare(x))
		{
            System.out.print("Number is perfect square...");
		}
        else{
            System.err.print("Number is not perfect square....);
		}
    }
}

 5)public class SquareRoot {
 
    public static void main(String[] args) 
    { 
        double a = 100; 
   
        System.out.println(Math.sqrt(a));
	}
 }
 
 7)public class Pattern{

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i-1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


		
		
	