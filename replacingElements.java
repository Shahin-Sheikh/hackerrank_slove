import java.util.*;
public class replacingElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sm=0;
        int sm1=0;
        int sm2=0;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        //String msg,msg1,msg2;
        
        int t = sc.nextInt();
        for(int x = 0; x<t; x++){

            int n = sc.nextInt();
            int d = sc.nextInt();
            /*if(x==0){
                sm=d;
            }
            if(x==1){
                sm1=d;
            }
            if(x==2){
                sm2=d;
            }*/
            int[] a = new int[n];
            for(int i = 0 ; i < n; i++){
                a[i] = sc. nextInt();
                /*sum = a[0] + a[1];
                System.out.println(sum);
                break;*/
                if (x == 0) {
                    sm = d;
                    for (int y = 0; y <= n; y++) {
                        if(a[i] <=d){
                            System.out.println("YES");
                            break;
                        }
                        else{
                            // a[j] = sc.nextInt();
                            sum = a[0] + a[1];
                            // break;
                        }

                    }
                }
                if (x == 1) {
                    sm1 = d;
                    for (int j = 0; j <= n; j++) {
                        if (a[i] <= d) {
                            System.out.println("YES");
                            break;
                        }
                        else{
                            // a[j] = sc.nextInt();
                            sum2 = a[0] + a[1];
                            // break;
                        }

                    }
                }
                if (x == 2) {
                    sm2 = d;
                    for (int k = 0; k < n; k++) {
                        if (a[i] <= d) {
                            System.out.println("YES");
                            break;
                        }
                        else{
                            // a[j] = sc.nextInt();
                            sum2 = a[0] + a[1];
                            // break;
                        }

                    }
                }
            }
        }
        if(sum<=sm){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        if (sum1 <= sm1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (sum2 <= sm2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}