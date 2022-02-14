import java.util.Scanner;

public class Main {
    public static void main(String[]args){
//I used array of grades in collecting
        Scanner strData = new Scanner(System.in);
        Scanner numData = new Scanner(System.in);
        Student student = new Student();
//here I am getting the Data
        System.out.print("Enter your Name: ");
        String name = strData.nextLine();
        System.out.print("Enter your Address: ");
        String address = strData.nextLine();
        System.out.print("Enter Your phone Number: ");
        String phoneNumber = strData.nextLine();
/*I used array to and for loop in collecting grades, this to avoid the
repetition of using thesame blocks of code.
array to store data and loop to collect data

* */
        int size = 5;
        double[] grades = new double[size];
        for(int i = 0; i < size; i++){
            System.out.print((i + 1)+") Enter your Grade:");
            grades[i] = numData.nextDouble();
        }
 // I am setting the data by passing the collected data from the input to the setters.
        student.setName(name);
        student.setAddress(address);
        student.setPhone(phoneNumber);
        student.setSubject(grades[0],grades[1],grades[2],grades[3], grades[4] );

//I can now print the Data

        System.out.println("\n[Students Data]");
        System.out.println("Name: "+student.getName());
        System.out.println("Address: "+ student.getAddress());
        System.out.println("phone number: "+ student.getPhone());
        student.gradesOut();
    }
}
