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
		int a=x.nextInt();
		int b[]={10,5,1};
		int counter=0;
		int j=0;
		while(a>0)
		{
		    if(a>=b[j])
		    {
		        a-=b[j];
		        counter++;
		    }
		    else{
		        j++;
		    }
		}
		System.out.println(counter);
	}
}
