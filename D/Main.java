import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int milesDriven;
        int gallonsUsed;
        int milesTotal = 0;
        int gallonsTotal = 0;
        System.out.println("Enter miles driven(-1 to quit): ");
        milesDriven = sc.nextInt();
        while(milesDriven != -1){
            System.out.println("Enter gallons used: ");
            gallonsUsed = sc.nextInt();

            milesTotal += milesDriven;
            gallonsTotal += gallonsUsed;

            System.out.println("MPG this trip: "+(milesDriven) / gallonsUsed);
            System.out.println("Total MPG: " +(milesTotal) / gallonsTotal);
            System.out.println("Enter miles driven (-1 to quit): ");
            milesDriven = sc.nextInt();
        }
    }
}