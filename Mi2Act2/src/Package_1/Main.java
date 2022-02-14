package Package_1;
import package_2.Voter;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
 /*I also separate the String data type from numerical data type its because sometimes when
 string and numeric data share thesame input string is sometimes being scape.*/
        Scanner numericData = new Scanner(System.in);
        Scanner strData = new Scanner(System.in);
//getting Data from the user.
        System.out.print("Voters Name: ");
        String name = strData.nextLine();
        System.out.print("How old are you?: ");
        int age =numericData.nextInt();
        System.out.print("Enter Your Voters ID#: ");
        int id_Number = numericData.nextInt();
        Voter voter = new Voter(name, age, id_Number);
//this line there is to print the collected data data.
        System.out.println("\n");
        if(voter.isEligibleForVoting() == true) System.out.println("Eligible to vote! Have a nice Day!");
        else System.out.println(" you are not eligible to vote!");
        System.out.println("\n[INFO]\n");
        System.out.println("Name: "+voter.getName());
        System.out.println("Age: "+voter.getAge());
        System.out.println("Voter's ID: "+voter.getVoters_ID());
    }
}
