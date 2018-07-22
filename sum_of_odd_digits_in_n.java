import java.util.Scanner;

public class sum_of_odd_digits_in_n {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println(sumodddigits(n));

	}
	public static int sumodddigits(int n)
	{
		int sum=0,rem,i=0,count=0;
		int a[] = new int[30];
		while(n!=0)
		{
			rem=n%10;
			a[i]=rem;
			i++;
			count++;
			n=n/10;
			
		}
		for(i=count-1;i>=0;i-=2)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}
