import java.util.Scanner;

public class n_multiple_of_m {

	public static void main(String[] args) 
	{
		int n,m;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		m=in.nextInt();
		System.out.println(checkmultiple(n,m));

	}
	public static boolean checkmultiple(int n,int m)
	{
		if(n%m==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
