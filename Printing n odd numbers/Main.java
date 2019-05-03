import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
       int i=1;
      int j=1;
      while(j<=n)
      {
        System.out.println(i);
        i=i+2;
        j=j+1;
      }
       
	}
}