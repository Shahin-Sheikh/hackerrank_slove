

import java.util.*;

public class countingvally {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); input.nextLine();
        String terrain = input.nextLine();
        int level = 0; 
        int valleys = 0;
        boolean belowSea = false;
        
        for(int i = 0; i < n; i++)
        {
            char slope = terrain.charAt(i);
            if(slope == 'U')
                level++;
            else
                level--;
        
            if(!belowSea && level < 0)
            {
                valleys++;
                belowSea = true;
            }
            
            if(level >= 0)
                belowSea = false;
        }
        System.out.println(valleys);
    }
}
