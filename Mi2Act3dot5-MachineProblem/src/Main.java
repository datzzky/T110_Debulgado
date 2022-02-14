import java.util.Scanner;

public class Main {
    static int x = 0;
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.print("Enter any positive integer: ");
            System.out.print("");
            x = scanner.nextInt();
        }while (x < 1);

        while (!(x == 1)) {
            if (x % 2 == 0) x = x / 2;
            else x = (3*x)+1;
            System.out.println(x);
        }
    }
}