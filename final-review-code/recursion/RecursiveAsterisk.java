package finalcodereview.recursion;

public class RecursiveAsterisk {

	public static void main(String[] args)
	{
		int m = 5;
		int n = 8;
		
		printAsterisk(m,n);
	}
	
	public static void printAsterisk(int m, int n)
	{
		if(m<=n)
		{
			System.out.println("m="+m+",n="+n);
			asterisk(m);
			printAsterisk(m+1,n);
			System.out.println("m="+m+",n="+n);
			asterisk(m);
			
		}
	}
	
	public static void asterisk(int m)
	{
			for(int i=0; i<m; i++)
			{
				System.out.print("*");
			}
			System.out.println("");
	}
	
}


