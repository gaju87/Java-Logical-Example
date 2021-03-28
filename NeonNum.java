import java.util.*;

class NeonNum
{
	public static void main(String [] arg)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the any Number");
		int x=s.nextInt();
		
		int Square = x*x;
		System.out.println("Number"+Square);
		int sum=0;
		while(Square>0)
		{
			int r = Square%10;
			sum+=r;
			Square = Square/10;
		}
		if(sum==x)
			System.out.println("Is a neon Number");
		else
			System.out.println("Is Not a Neon Number");
	}
}