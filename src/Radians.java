import java.util.Scanner;
/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 *
 * @since Version 1.0
 */
import static java.lang.Math.PI;

public class Radians {

    public static double toRadians(double degrees) {
        // Pur your code here
        double radians = degrees * PI / 180;
        return radians;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        double degrees = radians * 180 / PI;
        return degrees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        System.out.println(toRadians(degrees));
        System.out.println(Math.toRadians(degrees));

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        System.out.println(toDegrees(radians));
        System.out.println(Math.toDegrees(radians));

    }
}