import java.util.Scanner;

public class nth_fibonacci {

	public static void main(String[] args)
	{
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println(fibo(n));
	}
	public static int fibo(int n)
	{
		int arr[] = new int[n+2];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];

}
}
