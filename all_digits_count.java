import java.util.Scanner;

public class all_digits_count {

	public static void main(String[] args) 
	{
		int n;
		Scanner in  = new Scanner(System.in);
		n = in.nextInt();
		System.out.println(count(n));
	}
	public static int count(int n)
	{
		int rem,count=0;
		while(n!=0)
		{
			rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}

}
