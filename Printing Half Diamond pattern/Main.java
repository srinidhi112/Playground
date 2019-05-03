import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
         
        Scanner in = new Scanner(System.in);
       
        int n=in.nextInt();
       
        int count = n-1;
        for (int k=1;k<=n;k++) {
            for (int i=1;i<=count;i++)
                System.out.print(" ");
            count--;
            for (int i=1;i<=2*k-1;i++)
                System.out.print("*");
            System.out.println();
        }
	}
}