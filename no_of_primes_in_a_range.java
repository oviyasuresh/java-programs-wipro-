import java.util.Scanner;

public class no_of_primes_in_a_range {

	public static void main(String[] args) 
	{
		int n,m;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		m=in.nextInt();
		System.out.println(countprime(n,m));
	}
	public static int countprime(int n,int m)
	{
		int count=0,flag=0;
		for(int i=n;i<=m;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
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
				count++;
			}
		}
		return count;
	}
}
