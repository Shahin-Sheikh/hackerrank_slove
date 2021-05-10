import java.util.*;
public class reversearray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int ara[] = new int[n];
        for(int i=0;i<n;i++){
            ara[i]=sc.nextInt();
        }
        for(int j = ara.length-1;j>=0;j--){
            System.out.println(ara[j]);
        }
    }
}