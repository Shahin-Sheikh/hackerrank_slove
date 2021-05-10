import java.util.*;
public class differentdivisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            if(n%i==0){
                result++;
            }
        }
    }
}
