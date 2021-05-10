import java.util.*;

public class ooddivisor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test;
        test = sc.nextInt();
        long[] ara = new long[test];
        for(int i = 0; i < test ; i++){
            ara[i] = sc.nextLong();
        }
        while(test>0){
            for(int j = 0 ; j<test;j++){
                while(ara[j] % 2 == 0){
                    ara[j] /= 2;
                }
                System.out.println(ara[j] > 1 ? "YES" : "NO");
            }
        }
    }
}