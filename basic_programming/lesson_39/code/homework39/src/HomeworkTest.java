import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    private Homework homework;

    @BeforeEach
    public void setUp(){
        homework = new Homework();
    }

    @Test
    public void yesOrNo_empty_test(){
        assertEquals(Arrays.asList(), homework.compareYesNo(Arrays.asList(),Arrays.asList()));
    }


    @Test
    public void yesOrNo_oneElt_test(){
        List<String> expected = Arrays.asList("No");
        List<Integer> actual1 = Arrays.asList(2);
        List<Integer>actual2 = Arrays.asList(7);
        assertEquals(Arrays.asList(), homework.compareYesNo(Arrays.asList(),Arrays.asList()));
    }

    @Test
    public void yesOrNo_severalElt_test(){
        List<String> expected = Arrays.asList("No","Yes","Yes","No");
        List<Integer> actual1 = Arrays.asList(1,2,3,4);
        List<Integer>actual2 = Arrays.asList(7,2,3,9);
        assertEquals(Arrays.asList(), homework.compareYesNo(Arrays.asList(),Arrays.asList()));
    }

    @Test
    public void yesOrNo_severalEltBig_test(){
        List<String> expected = Arrays.asList("No","Yes","Yes","No");
        List<Integer> actual1 = Arrays.asList(1000,2000,3000,4000);
        List<Integer>actual2 = Arrays.asList(7000,2000,3000,9000);
        assertEquals(Arrays.asList(), homework.compareYesNo(Arrays.asList(),Arrays.asList()));
    }

}