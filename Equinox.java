import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  if(sc.hasNext()){
   int t = sc.nextInt();
   while(t-->0){
       String check = "EQUINOX";
       int N = sc.nextInt();
       long A = sc.nextLong();
       long B = sc.nextLong();
       long sarthak=0,anu=0;
       for(int i=1;i<=N;i++){
           String s = sc.next();
           String ch =""+ s.charAt(0);
           if(check.contains(ch))
           sarthak = sarthak+A;
           else
           anu = anu+B;
       }
       if(sarthak>anu)
       System.out.println("SARTHAK");
       else if(anu>sarthak)
       System.out.println("ANURADHA");
       else
       System.out.println("DRAW");
   }
}
    }
}
