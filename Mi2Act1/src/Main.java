import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner numericData = new Scanner(System.in);
        Scanner strData = new Scanner(System.in);
        ArrayList<Employee> employee = new ArrayList<>();
       // System.out.print("how many employee?: ");
        int counter = 2;// this is the counter of the number of employee
        for(int i = 0; i < counter; i++){//I used loop since I think its more convenient than repeating the same blocks of codes.
            System.out.println("Employee #" + (i+1));
            System.out.print("Employee Name: ");
            String Name = strData.nextLine();
            System.out.print("ID#: ");
            int ID = numericData.nextInt();
            System.out.print("Enter the Salary: ");
            float salary = numericData.nextFloat();
            employee.add(new Employee(Name, ID, salary));//I used ArrayList to store the employer data.
            System.out.println("\n");
        }
        System.out.println("\n\n\n");//Finally I can now print the following Data from arrayLIst using a loop and the get() Method
        for(int i =0; i < employee.size(); i++){//employee.size is the total size of arrayList default in arrayList package.
            System.out.println("\nEmployee #"+ (i+1));//I used the getters to from the constructors to get the arrayList data
            System.out.println("Name: "+ employee.get(i).getName());
            System.out.println("ID number: "+ employee.get(i).getID_number());
            System.out.println("Salary:"+ employee.get(i).getSalary());
        }
    }
}
