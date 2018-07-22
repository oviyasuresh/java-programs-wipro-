import java.util.Scanner;

public class sum_of_odd_or_even_digits {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println(sumoddevendigits(n));
	}
	public static int sumoddevendigits(int n)
	{
		int choice;
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
		Scanner inp = new Scanner(System.in);
		choice=inp.nextInt();
		switch(choice)
		{
		case 1:
		{
			for(i=count-1;i>=0;i-=2)
			{
				sum=sum+a[i];
			}
			break;
		}
		case 2:
		{
			for(i=count-2;i>=0;i-=2)
			{
				sum=sum+a[i];
			}
			break;
		}
		}
		
		return sum;
	}

}
