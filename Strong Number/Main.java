import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num1=num%10;
      int num3=num/100;
      int num2=num%10;
      int fact1=1,fact2=1,fact3=1;
      for(int i=1;i<=num1;i++)
      {
        fact1=fact1*i;
      }
      for(int i=1;i<=num2;i++)
      {
        fact2=fact2*i;
      }
      for(int i=1;i<=num3;i++)
      {
        fact3=fact3*i;
      }
      int fact4=fact1+fact2+fact3;
      if(fact4>num)
        System.out.println("Yes");
      else
        System.out.println("No");
      
      
	}
}