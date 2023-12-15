public class Circle extends Shape{

    private double radius;
    private static double PI = 3.14;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double findArea(){
        return PI * radius * radius;
    }

    public String toString(){
        return  super.toString() + " , radius =" +radius;
    }

}
