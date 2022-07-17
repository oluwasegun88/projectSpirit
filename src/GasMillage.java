//Input miles and gallon used for each trip
// Calculate miles per gallon obtained for each trip


//Get input from the user
// Check if input value is not our sentinel value
// Prompt user to enter inputs again
// Check if value is equals to our sentinel value
// Output miles per gallon obtained for each trip

import java.util.Scanner;

public class GasMillage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sentinel = 0;
        int miles;
        int gallon;

        System.out.println("Enter miles or 0 to end the application");
        miles = scanner.nextInt();

        while (miles != sentinel){
            System.out.println("Enter gallons used for the trip");
            gallon = scanner.nextInt();

            double gallonUsed = miles/gallon;
            System.out.println("Gallon used is "+gallonUsed);

            System.out.println("Do you want to end this application? if yes press 0 if no press 1 to continue");
            int endApp = scanner.nextInt();

            if (endApp == sentinel){
                gallonUsed = miles/gallon;
                System.out.println("Gallon used is "+gallonUsed);
                System.exit(0);
            }

            System.out.println("Enter miles or 0 to end the application");
            miles = scanner.nextInt();

        }
    }

}
