import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner xx=new Scanner(System.in);
         int x=xx.nextInt();
         int y=xx.nextInt();
         if(x==y)
         {
             System.out.println(x);
         }
         else
         {
             if(x==0 && y==1)
             {
                 System.out.println("2");
             }
             if(x==0 && y==2)
             {
                 System.out.println("1");
             }
             if(x==1 && y==0)
             {
                 System.out.println("2");
             }
             if(x==1 && y==2)
             {
                 System.out.println("0");
             }
             if(x==2 && y==0)
             {
                 System.out.println("1");
             }
             if(x==2 && y==1)
             {
                 System.out.println("0");
             }
         }
    }
       
