package package_2;

public class Voter {
    private String name;
    private int age;
    private int voters_ID;
    public Voter(String name, int age, int voters_ID){
        setName(name);
        setAge(age);
        setVoters_ID(voters_ID);
    }
/*setters       I prefer to make the setters private since I already set the constructors and also not
 to mess up with the external a classes
 */  private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setVoters_ID(int voters_ID) {
        this.voters_ID = voters_ID;
    }
    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getVoters_ID() {
        return voters_ID;
    }
    /*this boolean there is used to validate the age*/
    public boolean isEligibleForVoting(){
        if(getAge()<19)return false;
        else return true;
    }
}
