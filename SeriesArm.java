import java.util.*;
public class SeriesArm
{
public static void main(String arg[])
{
	for(int j=1; j<2000;j++)
	{	
		int n, temp,count=0; 
		//Scanner ab = new Scanner(System.in); 
		//n= ab.nextInt(); 
		temp= j;
		int sum=0; 
		while(temp>0)
		{ 
			count=count+1;			
			temp=temp/10;
		}	
		System.out.println("length of digit:"+count);
		temp=j;
		while(temp>0)
		{
			int digit = temp%10, pro = 1;
			for(int i=1; i<=count;i++)
			pro = pro * digit;
			sum= sum + pro;
			temp=temp/10;
		}
		if(j==sum)
		{
			System.out.println("IS the Armstrong number:" +j);
		}
		else
		{
			System.out.println("IS not Armstrong number:" +j);
		}	
	}
	}
}