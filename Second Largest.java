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
		try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int[] array = new int[3];
                for(int i =0;i<3;i++){
                    array[i] = sc.nextInt();
                }
                Arrays.sort(array);
                System.out.println(array[1]);
            }
        } catch (Exception e) {
            return;
        }
	}
}
