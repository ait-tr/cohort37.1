import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach // этот метод будет выполняться перед каждым тестовым методом
    public void setUp(){
        calculator = new Calculator();
    }

    // given_[condition]_when[ what is done]Then[expectedResult]

    @Test // это тестовый метод
    @DisplayName("Simple multiplication should be correct") // можно использовать для
                                                    // определения имени, уточнения задачи теста
    public void testMultiply(){

        assertEquals(6, calculator.multiply(2,3)); //  здесь определяется равенство
        // ожидаемого и фактического значения

    }
    @Test
    @DisplayName("Checking correct work with 0")
    public void testMultiplyZero(){
        assertEquals(0, calculator.multiply(0,5));
        assertEquals(0,calculator.multiply(5,0));
    }

   // given_____when____then____
   // givenAandB_whenCompare_thenReturn_true

    @Test
   public void given3and0_whenCompare_thenReturnTrue() {
        assertTrue(calculator.compareNumbers(3,0));
        assertTrue(3>2);
   }

   @Test
   public void givenThreeLessThanOne_whenResultFalse_thenReturnTrue(){
        assertFalse(calculator.compareNumbers(1,3));
        assertTrue(calculator.compareNumbers(1,3));
   }





}