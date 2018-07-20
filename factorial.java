import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println(printfactorial(n));

	}
	public static int printfactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
