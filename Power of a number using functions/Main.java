import java.util.Scanner;
class Main{
  public static long power(int b,int e)
  {
    long res=1; 
     if(b>=0&&e==0)     
        res=1; 
     else if(b==0&&e>=1) 
        res=0;
     else 
       for(int i=1;i<=e;i++)       
         res=res*b; 
     return res;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    long r=1;
    int b=in.nextInt();
    int e=in.nextInt();
    r=power(b,e);
    System.out.println(r);
  }
}
    