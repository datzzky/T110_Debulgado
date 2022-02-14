public class Employee {
    private String Name;
    private int ID_number;
    private float salary;

    public Employee(String Name, int ID_number, float salary){ //this is the constructor of the object employee.
        setName(Name);
        setID_number(ID_number);
        setSalary(salary);
    }

    // setters will set the following for the object.
    public void setName(String Name){
        this.Name = Name;
    }
    public void setID_number(int ID_number){
        this.ID_number = ID_number;
    }
    public void setSalary(float salary){
        salary = (float) (salary - (salary * 0.10)); //I set the setters for the salary to calculate total salary and the tax
        this.salary = salary;                          // also I casted the data type into float since multiplying float with double will result to double.
    }                                                  //lastly 10% in decimal is 0.10
//getters will get the following data from the object and can be use by the external class later.
    public String getName() {
        return Name;
    }

    public int getID_number() {
        return ID_number;
    }

    public float getSalary() {
        return salary;
    }
}