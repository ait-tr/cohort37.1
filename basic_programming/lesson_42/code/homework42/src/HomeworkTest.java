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
    public void findNameToNumberOccurenceWhen2_test(){
        List<String> actual = Arrays.asList("John","Mary","Peter","John");
        assertEquals(2,homework.findNameToNumberOccurence(actual,"John"));
    }

    @Test
    public void findNameToNumberOccurenceWhen1_test(){
        List<String> actual = Arrays.asList("John","Mary","Peter","John");
        assertEquals(1,homework.findNameToNumberOccurence(actual,"Peter"));
    }

    @Test
    public void findNameToNumberOccurenceWhen0_test(){
        List<String> actual = Arrays.asList("John","Mary","Peter","John");
        assertEquals(0,homework.findNameToNumberOccurence(actual,"Evgeny"));
    }

    @Test
    public void findNameToNumberOccurenceWhen2JohnsOnly_test(){
        List<String> actual = Arrays.asList("John","John");
        assertEquals(2,homework.findNameToNumberOccurence(actual,"John"));
    }


    @Test
    public void findNameToNumberOccurenceWhenEmpty_test(){
        List<String> actual = Arrays.asList();
        assertEquals(0,homework.findNameToNumberOccurence(actual,"Evgeny"));
    }

}