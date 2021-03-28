import java.util.*;
public class Armstrong
{
	public void M1()
	{
		int n, temp,count=0; 
		Scanner ab = new Scanner(System.in); 
		n= ab.nextInt(); 
		temp= n;
		int sum=0; 
		while(temp>0)
		{ 
			count=count+1;			
			temp=temp/10;
		}	
		System.out.println("length of digit:"+count);
		temp=n;
		while(temp>0)
		{
			int digit = temp%10, pro = 1;
			for(int i=1; i<=count;i++)
			pro = pro * digit;
			sum= sum + pro;
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println("IS the Armstrong number:" +n);
		}
		else
		{
			System.out.println("IS not Armstrong number:" +n);
		}	
	}
		
public static void main(String arg[])
{
	Armstrong x = new Armstrong();
	x.M1();
}
}