import java.util.Scanner;

public class Main {
    public static  void main(String[]args){
        System.out.println("What to calculate? [1. Triangle]   [2. Rectangle]   [3.Parallelogram]  [4.Circle]");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> {
                Triangle triangle = new Triangle();
                triangle.setHeight();
                triangle.setBase();
                triangle.areaOut(triangle.areaOfTriangle(triangle.getBase(), triangle.getHeight()));
            }
            case 2 -> {
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight();
                rectangle.setBase();
                rectangle.areaOut(rectangle.areaOfRectangle(rectangle.getHeight(), rectangle.getBase()));
            }
            case 3 -> {
                parallelogram parallelogram = new parallelogram();
                parallelogram.setHeight();
                parallelogram.setBase();
                parallelogram.areaOut(parallelogram.areaOfParallelogram(parallelogram.getHeight(), parallelogram.getBase()));
            }
            case 4 -> {
                Circle circle = new Circle();
                System.out.print("Enter the radius: ");
                float radius = scanner.nextFloat();
                circle.setRadius(radius);
                circle.areaOut(circle.areaOfCircle());
            }
        }
    }
}
