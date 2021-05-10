import java.util.Scanner;
public class Calculation {
    int cal(){
        Scanner sc = new Scanner(System.in);
        float sales,commission, earnings;
        while(true){
            System.out.println("Enter sales in dollars(-1 to end): ");
            sales = sc.nextFloat();

            if(sales == -1){
                return 0;
            }
            commission = sales/100*9;
            earnings = commission + 200;

            System.out.println("salesperson's earnings"+earnings);
        }
    }
}
