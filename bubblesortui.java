import java.util.*;
public class bubblesortui{
    public static void bubble(int[] ara){
        int z = ara.length;
        int temp=0;
        for(int i=0;i<z;i++){
            for(int j=1;j<(z-1);j++){
                if(ara[j-1]>ara[j]){
                    temp = ara[j-1];  
                    ara[j-1] = ara[j];  
                    ara[j] = temp; 
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =sc.nextInt();
        int[] ara = new int[n];
        for(int x=0;x<n;x++){
            ara[x] = sc.nextInt();
        }
        System.out.println("Print before array is sorted:");
        for(int i: ara){
            System.out.print(i+"");
        }
        bubble(ara);
        System.out.println();
        System.out.println("Print sorted array: ");
        for(int i:ara){
            System.out.print(i+"");
        }

    }
}