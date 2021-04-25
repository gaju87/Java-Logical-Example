import java.util.*;
public class Solution
{
public void Comp()
{
int N;
Scanner x= new Scanner (System.in);
N=x.nextInt();
if(N==1){
System.out.println("weird");
}
else if(N%2==0 && N>=2 || N<=5)
{
System.out.println("Not weird");
}
else if( N%2==0 || N>=6 && N<15)
{
System.out.println("weird");
}
else if (N%2==0 && N>20)
{
System.out.println("Not weird");
}
}
public static void main(String[] args)
{
Solution a = new Solution();
	a.Comp();
}
}