/*this program will calculate the how many degrees does the circle rotates in a second
*
* */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many RPM does it rotates: ");
        double rpm = scanner.nextDouble();
        //dividing rpm by 60 will give value of rotation per second
        System.out.println("The circle rotates at " + ((rpm/60) * 360) + " degrees per second");
    }/*//since 1 complete rotation is equal to 360 degrees, multiplying it with the total rps will give
     of the total degrees of rotation.
     */
}