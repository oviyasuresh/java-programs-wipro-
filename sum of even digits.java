import java.util.Scanner;


public class sum_of_even_digits_in_num {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println(sumevendigits(n));

	}
	public static int sumevendigits(int n)
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
		for(i=count-2;i>=0;i-=2)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
