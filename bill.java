import java.util.*;
public class bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int val =0;
        int sum = 0;
        int sub = 0;
        int div;
        int str = 0;
        int[] ara = new int[n];
        for(int i=0;i<n;i++){
            ara[i] = sc.nextInt();
            sum = sum + ara[i];
        }
        val = ara[k];
        sub = sum - val;
        div = sub / 2;
        int b = sc.nextInt();
        str = b - div;
        if(b>div){
            System.out.println(str);
        }
        else{
            System.out.println("Bon Appetit");
        }
        
         
    }
}