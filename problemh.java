import java.util.*;
public class problemh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l,r;
        l=sc.nextInt();
        r=sc.nextInt();
        if(r == 0 && l==0){
            System.out.println("Not a moose");
        }
        else if(l==r){
            int sum = l+r;
            System.out.println("Even " +sum);
        }
        else{
            if(l>r){
                int sum1 = l *2;
                System.out.println("Odd " +sum1);
            }
            if(r>l){
                int sum2 = r*2;
                System.out.println("Odd " +sum2);
            }
        }
    }
}