import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int n4=gcd(n1,n2);
      System.out.print(gcd(n4,n3));
      
    }
  public static int gcd(int n1,int n2)
  {
    int min,g=1;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
    }
    while(min>=1)
    {
      if((n1%min==0) && (n2%min==0))
      {
        g=min;
        break;
      }
      min--;
    }  
   return g;
  }
}