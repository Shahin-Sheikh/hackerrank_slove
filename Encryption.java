import java.util.*;
import java.lang.Math;
public class Encryption {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int rows = (int) Math.sqrt(s.length());
        int columns = (s.length() > rows*rows) ? rows+1: rows;
        rows = (s.length() > rows*columns) ? rows+1: rows;

        //Start the loop
        for(int i=0;i<columns;i++){
            int currentindex = i;
            for(int j=0; j<rows;j++){
                if(currentindex <= s.length()-1){
                    System.out.print(s.charAt(currentindex));
                }
                currentindex = currentindex + columns;
            }
            if(i+1 != columns){
                System.out.print(" ");
            }
        }
    }
}
