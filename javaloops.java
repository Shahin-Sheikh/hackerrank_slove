import java.util.*;
public class javaloops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul=1;
        for(int i=1; i<=10; i++){
            mul=n*i;
            System.out.println(n+" "+"x"+" "+i+" "+"="+" "+mul);
        }
    }
}
