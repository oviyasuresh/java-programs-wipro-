package P1;
import java.util.Scanner;
public class addlastdigits {

	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner in = new Scanner(System.in);
		n1=in.nextInt();
		n2=in.nextInt();
		System.out.println(addlastdigits(n1,n2));

	}
	public static int addlastdigits(int n1,int n2)
	{
		int x,y;
		x=Math.abs(n1%10);
		y=Math.abs(n2%10);
		return x+y;
	}

}
