import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
  int x=sc.nextInt();
   int a=sc.nextInt();
    int b=sc.nextInt();
   
    int temp= 100-x;
    a+= (temp*b);
    System.out.println(a*10);
}
    }
}
