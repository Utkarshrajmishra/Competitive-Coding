import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        while(t-->0)
        {
            int n=x.nextInt();
            int k=x.nextInt();
            int arr[]=new int[n];
            int counter=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=x.nextInt()+k;
                if(arr[i]%7==0)
                {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
