import java.util.Scanner;

/**
 * Created by tlt31 on 2/19/15.
 */
public class Lab3ProgrammingChallenge9 {

    public static void main(String[] args) {

        int daysMultiplying = 0;
        float population = 0;
        float popIncrease = 0;

        Scanner scan = new Scanner(System.in);

        boolean error = true;
        while (error) {
            System.out.println("What is the starting number of organisms?");
            population = scan.nextFloat();
            if (population < 2) {
                System.out.println("The beginning population should be two or more.");
                error = true;
            } else {
                error = false;
            }
        }

        error = true;
        while (error) {
            System.out.println("What is the average daily population increase?");
            popIncrease = scan.nextFloat();
            if (popIncrease < 0) {
                System.out.println("The population increase should be positive.");
                error = true;
            } else {
                error = false;
            }
        }

        error = true;
        while (error) {
            System.out.println("How many days will the population increase?");
            daysMultiplying = scan.nextInt();
            if (daysMultiplying < 1) {
                System.out.println("The population should increase for more than one day.");
                error = true;
            } else {
                error = false;
            }
        }

        popIncrease = popIncrease/100+1;
        System.out.println(" Day     Population ");
        System.out.println("--------------------");
        for (int i = 0; i <= daysMultiplying; i++ ) {
            System.out.println(" " + i + "            " + (int)(population));
            population = (int) Math.floor(population*popIncrease);
        }

    }
}
