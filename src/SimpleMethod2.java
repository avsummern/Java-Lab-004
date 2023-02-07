import java.util.Scanner;
/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 *
 * @since Version 1.0
 */
public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int a){
        int squared = (a * a);
        return squared;
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        System.out.println("Please enter the integer you would like to square:");
        Scanner number = new Scanner(System.in);
        int userNum = number.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int finalNum = square(userNum);
        // Put the result System.out code here.
        System.out.printf("%d squared is %d", userNum, finalNum);

    }
}
