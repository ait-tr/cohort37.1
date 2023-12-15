public class Square extends Shape{

    private double a;

    public Square( String name, double a){
        super(name);
        this.a = a;
    }

    public double findArea(){
        return a*a;
    }
}