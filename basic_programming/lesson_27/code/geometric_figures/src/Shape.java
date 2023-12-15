public class Shape {

    private String name;

    public Shape( String name){
        this.name = name;
    }

    public double findArea(){

        return 0.0;
    }

    public String  getName(){
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name;
    }
}
