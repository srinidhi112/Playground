import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num1=num%10;
 
      while(num>=10)
      {
        num=num/10;
      }
      System.out.println(num1+num);
	}
}