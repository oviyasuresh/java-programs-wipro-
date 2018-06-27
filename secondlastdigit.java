package P1;
import java.util.Scanner;
public class secondlastdigit {

	public static void main(String[] args) 
	{
		int num;
		Scanner in =new Scanner(System.in);
		num=in.nextInt();
		System.out.println(secondlast(num));

	}
	public static int secondlast(int num)
	{
		int n;
		if(num%10!=num)
		{
			n=num/10;
			return Math.abs(n%10);
		}
		else
		{
			return -1;
		}
	}

}
