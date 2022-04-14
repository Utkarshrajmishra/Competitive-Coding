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
		 Scanner sc=new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0){
	     // your code goes here
	     int quantity = sc.nextInt(),price = sc.nextInt();
	     float total_price = quantity*price;
	     float final_price;
	     if(quantity>1000){
	         final_price = (total_price-((total_price*10)/100));
	         System.out.println(final_price);
	     }else System.out.println(total_price);
	    }
	}
}
