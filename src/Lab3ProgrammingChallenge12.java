import java.util.Scanner;

/**
 * Created by tlt31 on 2/19/15.
 */
public class Lab3ProgrammingChallenge12 {

    public static void main(String[] args) {

        final int air = 1100, water = 4900, steel = 16400;
        float medium = 0, inputD = 0;
        float time;
        String input = "";

        Scanner scan = new Scanner(System.in);

        boolean error = true;
        while (error) {
            System.out.println("Please enter the medium you are calculating for.\nThis can be be air, water, or steel.");
            input = scan.nextLine();
            if (input.equals("air")) {
                System.out.println("you have entered air");
                medium = air;
                error = false;
            } else if (input.equals("water")) {
                System.out.println("you have entered water");
                medium = water;
                error = false;
            } else if (input.equals("steel")) {
                System.out.println("you have entered steel");
                medium = steel;
                error = false;
            } else {
                System.out.println("you have not entered a valid selection");
            }
        }

        error = true;
        while (error) {
            System.out.println("Please enter the distance you are calculating for.\nThis should be in feet.");
            inputD = scan.nextInt();
            if (inputD <= 0) {
                System.out.println("you have entered a distance less than 0.  Try again");
                error = true;
            } else {
                System.out.println("you are calculating for " + inputD + " feet");
                error = false;
            }
        }

        time = inputD/medium;
        System.out.println("It will take " + time + " seconds for sound to travel " + inputD + "ft through " + input + ".");

    }

}
