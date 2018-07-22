import java.util.Scanner;

public class sum_of_all_digits_in_num {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println(sumdigits(n));
	}
	public static int sumdigits(int n)
	{
		int sum=0,rem;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}
