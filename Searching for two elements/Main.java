import java.util.Scanner;
class Main{
  public static int find(int arr[],int key,int n)
  {
    for(int i=0;i<n;i++)
    {
      if(arr[i]==key)
      {
        return i;
      }
    }
    return -1;
    }
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int key1=in.nextInt();
      int key2=in.nextInt();
      int i=find(arr,key1,n);
      int j=find(arr,key2,n);
      System.out.println(i);
      System.out.println(j);
       
      
    }
}