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
		    int d=x.nextInt();
		    String stu=x.next();
		    for(int i=0;i<stu.length();i++)
		    {
		        if(stu.charAt(i)=='0' || stu.charAt(i)=='5')
		        {
		            counter++;
		        }
		    }
		    if(counter>0)
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
