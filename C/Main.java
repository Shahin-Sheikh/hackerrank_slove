import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int num = sc.nextInt();
            System.out.println("You entered"+num);
        }
        catch(InputMismatchException e){
            System.out.println("Only letters are accepted");
        }
    }
}