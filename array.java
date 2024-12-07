import java.util.*;
class A 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        System.out.print("even ");
        for(int i=0;i<arr.length;i+=2)
        {
              System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("odd ");
        for(int i=1;i<arr.length;i+=2)
        {
              System.out.print(arr[i]+" ");
        }
    }
}