/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner x=new Scanner(System.in);
		int a=x.nextInt(); int counter=0;
		boolean prime[] = new boolean[a+ 1];
        for (int i = 0; i <= a; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= a; p++)
        {
           
            if (prime[p] == true)
            {
                
                for (int i = p * p; i <= a; i += p)
                    prime[i] = false;
            }
        }
 
        
        for (int i = 2; i <= a; i++)
        {
            if (prime[i] == true)
             counter++;  
        }
        System.out.println(counter);
	}
}
