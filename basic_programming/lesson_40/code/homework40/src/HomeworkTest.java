import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    Homework homework = new Homework();

    @Test
    public void shortestLongest_oneElement_test(){
        List<String> actual = Arrays.asList("a");
        assertEquals("a",homework.findShortestLongest(actual));
    }


    @Test
    public void shortestLongest_shortestFirst_test(){
        assertEquals("a",homework.findShortestLongest(Arrays.asList("bb","a","ee","ccc")));
    }


    @Test
    public void shortestLongest_longestFirst_test(){
        assertEquals("aaa",homework.findShortestLongest(Arrays.asList("bb","aaa","ee","c")));
    }

}