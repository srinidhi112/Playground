import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int n1=num1/100;
      int n2=num1%10;
      int sum=n1+n2;
      System.out.println(sum);
	}
}