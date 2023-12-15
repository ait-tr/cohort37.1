public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width){
        super(name);
        this.length = length;
        this.width = width;

    }

    public double findArea(){
        return length * width;
    }
}
