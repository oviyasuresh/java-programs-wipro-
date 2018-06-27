package P1;
import java.util.Scanner;
public class lastdigit 
{

	public static void main(String[] args) 
	{
		int num;;
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		System.out.println(lastdigit(num));

	}
	public static int lastdigit(int num)
	{
		return Math.abs(num%10);
	}
}
