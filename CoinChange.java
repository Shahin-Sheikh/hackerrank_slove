import java.util.*;
public class CoinChange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //n is the number of units
        int n = sc.nextInt();
        //m is the number of coin types
        int m = sc.nextInt();
        //coins as array
        int [] coins = new int[m];
        for(int i = 0; i < m; i++){
            coins[i] = sc.nextInt();
        }
        sc.close();
    }
    public static long numWays(int n, int[] coins){
        if(n<0){
            return 0;
        }
    }
    public static long numWays(){

    }
}
