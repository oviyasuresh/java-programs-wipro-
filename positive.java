package P1;
import java.util.Scanner;
public class positive 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		System.out.println(check(num));		
	}
	public static int check(int num)
	{
		if(num<0)
		{
			return -1;
		}
		else if(num>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
