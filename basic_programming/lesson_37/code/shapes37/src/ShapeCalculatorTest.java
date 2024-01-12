import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    private ShapeCalculator shapeCalculator = new ShapeCalculator();

    @Test
    public void test_zeroShape(){
        Shape[] actual = {};
        assertEquals(0, shapeCalculator.totalSquare(actual));
    }

    @Test
    public void test_oneShape(){
        Shape[] actual = {new Rectangle(5,10)};
        assertEquals(50.0, shapeCalculator.totalSquare(actual));
    }

    @Test
    public void test_twoShape(){
        Shape[] actual = {new Rectangle(5,10), new Circle(10)};
        assertEquals(364.0, shapeCalculator.totalSquare(actual));
    }

}