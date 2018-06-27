package P1;
import java.util.Scanner;
public class even {

	public static void main(String[] args) 
	{
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.println(evenorodd(num));
	}
	public static int evenorodd(int num)
	{
		if(num%2==0)
		{
			return 2;
		}
		else if(num==0)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}

}
