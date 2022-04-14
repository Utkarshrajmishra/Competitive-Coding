import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner x=new Scanner(System.in);
             int t=x.nextInt();
        while(t-->0)
        {
          float k1,k2,k3,v;
          k1=x.nextFloat();
          k2=x.nextFloat();
            k3=x.nextFloat();
            v=x.nextFloat();
            float sum=100/(k1*k2*k3*v);
                double time=Math.round(sum*100.0)/100.0;
         
            if(time<9.58)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
   
}

    }
}
