//https://github.com/Quincunx271/icpc-pacnw-2019
import java.util.*;
import java.lang.Math;
public class problemb{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A,B;
        double x=0;
        double ops = 0;
        A = sc.nextInt();
        B = sc.nextInt();
        while(true){
               if(A<=B){
              double data = (ops + (B-A));
              int value = (int)data;
              System.out.println(value);
              System.exit(0);
          }
        
          if(A%2 == 0){
              A = A/2;
              Math.floor(A);
              ops +=1;
          }
          else{
              A = (A+1)/2;
              Math.floor(A);
              ops +=2;
          }

        } 
    }
}