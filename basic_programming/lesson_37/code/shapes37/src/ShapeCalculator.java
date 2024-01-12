public class ShapeCalculator {

    public double totalSquare( Shape[] shapes){
        double res = 0;

        for( Shape shape : shapes){
            res += shape.area();
        }

        return res;
    }
}
