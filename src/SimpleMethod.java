import java.util.Scanner;
/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 *
 * @since Version 1.0
 */
public class SimpleMethod {
    // Put your method code here
    public static void square(int a){
        int squared = (a * a);
        System.out.printf("%d squared is %d", a, squared);
    }

    public static void main(String[] args) {
        // This is the method call, create the square method.
        Scanner number = new Scanner(System.in);
        int userNum = number.nextInt();
        square(userNum);
    }
}
