import java.util.Scanner;

public class nth_prime {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println(prime(n));
	}
	public static int prime(int n)
	{
		int arr[] = new int[50];
		int k=0,flag=0;
		for(int j=1;j<=50;j++)
		{
			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==0)
			{
				arr[k]=j;
				k++;
		    }
	   }
		
		return arr[n];
	}
}
