import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {
    private Practice practice = new Practice();

    @Test
    public void withoutNamesLengthFourTest(){
        List<String> actual = new ArrayList<>();
        actual.add("John");
        actual.add("Amalia");
        actual.add("Bill");
        actual.add("Kim");

        List<String> expected = new ArrayList<>();
        expected.add("Amalia");
        expected.add("Kim");

        assertEquals(expected,practice.withoutNamesLength4(actual));
        assertEquals(expected,practice.withoutNamesLength4Iterator(actual));
    }

}