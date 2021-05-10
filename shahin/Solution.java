package tushar;
import java.util.*;

public class Solution {
    public solution(int area){
        int a = 1;
        int b = 0;
        LinkedList<Integer>li = new LinkedList<>();
        LinkedList<Integer>l = new LinkedList<>();
        do{
            a = int((area-b) **(1/2));
            l.push(a*a);
            b = (a*a)+b;
            if(l == 0)(
                l.remove(0);
                res = str(l)[1:-1];
                res = res.replace("","");
                li = li
            )
        }
        while((a*a) != 0);
    }
}
