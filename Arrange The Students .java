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
		Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- >0)
        {
            String str = s.nextLine();
            int maxi=0;
            int c=0;
            for(int i=0;i<str.length();i++)
            {
               if(str.charAt(i)=='1')
               {
                   c++;
                   if(c>maxi)
                   maxi=c;
               }
               else
               c=0;
            }
            System.out.println(maxi);
        }
	}
}
