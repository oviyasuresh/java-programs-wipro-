package P1;

import java.util.Scanner;

public class greater 
{

	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner in = new Scanner(System.in);
		n1=in.nextInt();
		n2=in.nextInt();
		System.out.println(greater(n1,n2));

	}
	public static int greater(int n1,int n2)
	{
		if(n1>n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
	}

}
