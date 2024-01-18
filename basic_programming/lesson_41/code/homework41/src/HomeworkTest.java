import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    private  Homework homework;
    @BeforeEach
    public void setUp(){
        homework = new Homework();
    }

    @Test
    public void abTrue_test(){
        Map<String,String> actual = new HashMap<>();
        actual.put("a","Hi");
        actual.put("b","There");

        Map<String,String> expected = new HashMap<>();
        expected.put("a","Hi");
        expected.put("b","There");
        expected.put("ab","HiThere");

        assertEquals(expected,homework.ab(actual));
    }


    @Test
    public void abWhenNoA_test(){
        Map<String,String> actual = new HashMap<>();
        actual.put("c","Hi");
        actual.put("b","There");

        assertEquals(actual,homework.ab(actual));
    }


    @Test
    public void abWhenNoB_test(){
        Map<String,String> actual = new HashMap<>();
        actual.put("a","Hi");

        assertEquals(actual,homework.ab(actual));
    }

    @Test
    public void abWhenEmpty_test(){
        Map<String,String> actual = new HashMap<>();

        assertEquals(actual,homework.ab(actual));
    }


}