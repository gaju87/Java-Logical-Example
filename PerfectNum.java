import java.util.*;

class PerfectNum
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the any Number");		
		int x = s.nextInt();
		int sum_o_F=0;
		for(int i =1; i<x; ++i)
		{
			if(x%i==0)
			{
				System.out.println("factors of Number: "+i);
				sum_o_F +=i;
			}
		}
		
		System.out.println("Sum of number = "+sum_o_F);
		if(sum_o_F==x)
			System.out.println("Number is Perfect = "+x);
		else
			System.out.println("Number is Not Perfect = "+x);

	}
}