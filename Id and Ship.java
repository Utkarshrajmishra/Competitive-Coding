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
		Scanner x=new  Scanner(System.in);
		int t=x.nextInt();
		while(t-->0)
		{ 
		    char ch=(x.next()).charAt(0);
		    if(ch=='b'||ch=='B')
		    {
		        System.out.println("BattleShip");
		    }
		    else if(ch=='c'||ch=='C')
		    {
		     System.out.println("Cruiser");   
		    }
		    else if(ch=='d'||ch=='D')
		    {
		        System.out.println("Destroyer");
		    }
		    else if(ch=='f'||ch=='F')
		    {
		        System.out.println("Frigate");
		    }
		}
	}
}
