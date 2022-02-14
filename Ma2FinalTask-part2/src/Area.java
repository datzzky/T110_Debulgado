import java.util.Scanner;

public class Area {

    private int height, base;


    public void setHeight() {
        System.out.print("Enter Height: ");
        this.height = getValue();
    }
    public void setBase() {
        System.out.print("Enter Base: ");
        this.base =  getValue();
    }
    private int getValue(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
//getters
    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    public void areaOut(float area){
        System.out.println(area);
    }
}
