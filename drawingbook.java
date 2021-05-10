import java.util.*;
public class drawingbook{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, p;
        int str =0;
        n = sc.nextInt();
        p = sc.nextInt();
        int sub =0;
        sub = n - p;
        int diff = 0;
         if(sub == 1){
             diff = sub - 1;
            System.out.println(diff);
        }
        else{
              for(int i = 1; i<n; i++){
            if(i==p){

                str = i-1;
            }
        }
        System.out.println(str);

        }
        
    }
}