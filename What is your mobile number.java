/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner x=new Scanner(System.in);
       int t=x.nextInt();
       while(t-->0)
       {
           int counter=0;
           String stu=x.next();
           if(stu.length()==10){
           if(stu.charAt(0)=='0')
           {
               System.out.println("NO");
           }
              else{
                  for(int i=0;i<stu.length();i++)
                  {
                      char ch=stu.charAt(i);
                      if(ch=='0'||ch=='1'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
                      {counter++;}                  }
              }
              if(counter+1==stu.length())
              {
                  System.out.println("YES");
              }
              else{
                  System.out.println("NO");
              }
           }
           else{
               System.out.println("NO");
           }
       }
       
	}
}
