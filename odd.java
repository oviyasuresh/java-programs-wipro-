package P1;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) 
	{
		int num;
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		System.out.println(checkodd(num));

	}
	public static int checkodd(int num)
	{
		if(num%2!=0)
		{
			return 2;
		}
		else 
		{
			return 1;
		}
	}

}
