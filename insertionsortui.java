import java.util.*;
public class insertionsortui{
    public static void insertion(int[] ara){
        int z = ara.length;
        for(int i=1;i<z;i++){
            int key = ara[i];
            int j = i-1;
            while(j>-1 && ara[j]>key){
                ara[j+1] = ara[j];
                j--;
            }
            ara[j+1]=key;
            
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        int[] ara = new int[n];
        for(int x=0;x<n;x++){
            ara[x] = sc.nextInt();
        }
        System.out.println("Print the unsorted array:");
        for(int i: ara){
            System.out.println(i+"");
        }
        insertion(ara);
        System.out.println("Print the sorted array: ");
        System.out.println();
        for(int i: ara){
            System.out.println(i+"");
        }
    }
}