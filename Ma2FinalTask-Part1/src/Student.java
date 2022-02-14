public class Student  {
    private String name, address, phone;
    private double sub_A, sub_B, sub_C, sub_D, sub_E;
//setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setSubject(double sub_A, double sub_B, double sub_C, double sub_D, double sub_E){
        this.sub_A = sub_A;
        this.sub_B = sub_B;
        this.sub_C = sub_C;
        this.sub_D = sub_D;
        this.sub_E = sub_E;
    }
//getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void gradesOut() {
        System.out.println("\n[Grades]");
        System.out.println("IT121: "+ sub_A);
        System.out.println("IT110: "+ sub_B);
        System.out.println("IT123: "+ sub_C);
        System.out.println("GE105: "+ sub_D);
        System.out.println("GE106: "+ sub_E);
    }
}
