import java.util.Scanner;

public class unique_digits_count {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println(uniquecount(n));

	}
	public static int uniquecount(int n)
	{
		int count=0,rem,i=0,j=0,unique=0;
		int arr[] = new int[20];
		while(n!=0)
		{
			rem=n%10;
			arr[i]=rem;
			count++;
			i++;
			n=n/10;
		}
		for(i=0;i<count;i++)
		{
			for(j=i+1;j<count;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]='+';
				}
			}
		}
		for(i=0;i<count;i++)
		{
			if(arr[i]!='+')
			{
				unique++;
			}
		}
		return unique;
	}

}
