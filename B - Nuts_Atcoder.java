import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner x=new Scanner(System.in);
         int sum=0;
         int n=x.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=x.nextInt();
             if(arr[i]-10>0)
             {
                 sum+=arr[i]-10;
             }
         }
         System.out.println(sum);
         
    }
       
}
