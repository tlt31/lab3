import java.util.Scanner;

/**
 * Created by tlt31 on 2/19/15.
 */
public class Lab3ProgrammingChallenge2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        int speed = 0, time, timeTraveled = 0, distance;

        boolean error = true;
        while (error) {
            System.out.println("How fast is the vehicle moving? (in miles per hour)");
            speed = scan.nextInt();
            if (speed < 0 ){
                System.out.println("You have netered a negative number.  Please try again.");
            } else {
                error = false;
            }
        }

        error = true;
        while (error){
            System.out.println("How many hours has the vehicle been travelling? (in hours)");
            timeTraveled = scan.nextInt();
            if (timeTraveled < 1){
                System.out.println("You must enter a value greater than 1.");
            } else {
                error = false;
            }
        }

        System.out.println(" ");
        System.out.println("Hour    Miles Traveled");
        System.out.println("----------------------");
        for (time = 1; time <= timeTraveled; time++){
            distance = speed*time;
            System.out.print(time);
            System.out.println("            " + distance);
        }

    }
}
