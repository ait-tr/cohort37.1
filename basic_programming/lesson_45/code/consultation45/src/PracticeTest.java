import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    private Practice practice;
    String input;
    Predicate<String> predicate;
    Function<String,String>function;

    @BeforeEach
    public void setUp(){
        practice = new Practice();
        input = "aaa BBBB dDD eeEEe lll";
    }

    @Test
    public void test_3UpperCase(){
        predicate = s -> s.length() == 3;
        function = String::toUpperCase;

        assertEquals("AAA BBBB DDD eeEEe LLL", practice.transform(input,predicate,function));
    }


    @Test
    public void test_4LowerCase(){
        predicate = s -> s.length() == 4;
        function = String::toLowerCase;

        assertEquals("aaa bbbb dDD eeEEe lll", practice.transform(input,predicate,function));
    }


    @Test
    public void test_5Stars(){
        predicate = s -> s.length() == 5;
        function = s -> "*****";

        assertEquals("aaa BBBB dDD ***** lll", practice.transform(input,predicate,function));
    }

}