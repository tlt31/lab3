import java.util.Scanner;

/**
 * Created by tim on 2/14/15.
 */
public class lab3 {

    public static void main(String[] args) {

        //Declare variables
        int air, water, steel, medium, time;
        String input;

        //Add Scanner
        Scanner scan = new Scanner(System.in);

        //Ask user to enter air, water, or steel
        System.out.println("Please enter the medium you are calclulating for.\nThis can be be air, water, or steel.");
        input = scan.nextLine();
        if (input == "Air" || input =="air") {
            System.out.println("You selected air");
        } else {
            System.out.println("You have not selected a valid option");
        }


    }

}
