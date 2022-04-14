import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
int run=scan.nextInt();
for(int one=1;one<=run;one++){
   int x=scan.nextInt();
   int y=scan.nextInt();
   int xr=scan.nextInt();
   int yr=scan.nextInt();
   int d=scan.nextInt();
   if (xr*d<=x && yr*d<=y){
       System.out.println("YES");
   }
   else{
       System.out.println("NO");
   }
}
        
    }
}
