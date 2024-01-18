import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;

    @BeforeEach
    public void setUp(){
        main = new Main();
    }

    @Test
    public void getDuplicatesOneElement_test(){
        assertEquals(Arrays.asList(),main.getDuplicates(Arrays.asList("John")));
    }

    @Test
    public void getDuplicatesNoDuplicates_test(){
        List<String> actual = Arrays.asList("John","Peter","Ann");
        List<String> expected = Arrays.asList();

        assertEquals(expected,main.getDuplicates(actual));
    }


    @Test
    public void getDuplicatesWhenThreeJonsTwoMarias_test(){
        List<String> actual = Arrays.asList("John","Maria","Peter","Ann","Maria","John","John");
        List<String> expected = Arrays.asList("Maria","John");

        assertEquals(expected,main.getDuplicates(actual)
        );
    }

    @Test
    public void getDuplicatesWhenTwoJonsTwoMarias_test(){
        List<String> actual = Arrays.asList("John","Maria","Peter","Ann","Maria","John");
        List<String> expected = Arrays.asList("Maria","John");

        assertEquals(expected,main.getDuplicates(actual)
        );
    }

}