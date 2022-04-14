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
		    String stu=x.next();
		    int c=0,c1=0,c2=0;
		    for(int i=0;i<3;i++)
		    {
		        char ch=stu.charAt(i);
		        if(ch=='P')
		        c++;
		        if(ch=='C')
		        c1++;
		        if(ch=='M')
		        c2++;
		    }
		    if(c==1&&c1==1&&c2==1)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
