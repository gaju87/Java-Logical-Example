import java.util.*;
public class OddEven
{
	public static void main(String [] ags)
	{
		//Scanner s = new Scanner(System.in);
		//System.out.println("Enter any Number : ");
		//int x = s.nextInt();
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
			System.out.println("Given Number is Even : "+i);
			}
			else
			{
			System.out.println("Given Number is odd : "+i);
			}
		}
	}
}