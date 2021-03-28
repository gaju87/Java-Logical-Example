import java.util.*;
public class Palidrome
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any Number");
    		int num = s.nextInt();
		int rem;
		int rev=0;
		int temp;   
		temp=num;    
		  while(num>0)
		  {    
		  rem=num%10;  //getting remainder      
		  num=num/10;    
		  rev=(rev*10)+rem;
		  }    
		  if(temp==rev)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");
	}

}
