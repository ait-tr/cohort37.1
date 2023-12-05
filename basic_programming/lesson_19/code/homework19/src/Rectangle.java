public class Rectangle {
    int length;
    int width;

    public Rectangle( int length, int width){
        this.length = length;
        this.width = width;
    }

    int getArea(){
        return  length * width;
    }

    int getPerimeter(){
        return 2 * (length + width);
    }
}
