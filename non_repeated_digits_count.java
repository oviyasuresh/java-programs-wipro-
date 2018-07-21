import java.util.Scanner;

public class non_repeated_digits_count {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println(non_repeated_count(n));

	}
	public static int non_repeated_count(int n)
	{
		int count=0,rem,i=0,j=0,nr=0;
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
					arr[i]='+';
					arr[j]='+';
				}
			}
		}
		for(i=0;i<count;i++)
		{
			if(arr[i]!='+')
			{
				nr++;
			}
		}
		return nr;
	}

}
