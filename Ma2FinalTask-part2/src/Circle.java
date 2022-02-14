public class Circle extends  Area{
    private  float radius, pie = (float) 3.14;

    public float areaOfCircle(){
        float c = (float) (Math.pow(radius, 2)*pie);
        System.out.print("The Area of a circle is ");
        return c;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
