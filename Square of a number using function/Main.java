import java.util.Scanner;
class Main
{
  	public static int square(int n)
    {
      int res;
      res=n*n;
      return res;
    }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int res=square(n);
      System.out.println(res);
	} 
}