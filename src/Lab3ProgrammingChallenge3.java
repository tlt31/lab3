import java.util.Scanner;

/**
 * Created by tlt31 on 2/19/15.
 */
public class Lab3ProgrammingChallenge3 {

    public static void main(String[] args) {

        //Declare variables
        float weight, height, bmi;

        //Add Scanner
        Scanner scan = new Scanner(System.in);

        //Ask user for weight (in pounds)
        System.out.println("Please enter your weight in pounds?");
        weight = scan.nextFloat();
        System.out.println("You entered " + weight + " pounds");

        //Ask user for height (in inches)
        System.out.println("Please enter your height in inches?");
        height = scan.nextFloat();
        System.out.println("You entered " + height + " inches");

        //Calculate BMI
        bmi = (weight*703)/(height*height);
        System.out.println("You have a bmi of " + bmi);

        //Determine whether underweight, optimal, or overweight
        if (bmi <= 18.5){
            System.out.println("You are underweight");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("You are of optimal weight");
        } else if (bmi >= 25) {
            System.out.println("You are overweight");
        }
    }

}
