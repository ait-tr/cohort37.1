import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {
    private MapExercises mapExercises;

    @BeforeEach
    public void setUp(){
        mapExercises = new MapExercises();
    }

    @Test
    public void mapStringBoolean_test(){
        String[] actual = new String[]{"a","b","a","c","b"};

        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a",true);
        expected.put("b",true);
        expected.put("c",false);

        assertEquals(expected,mapExercises.mapStringBoolean(actual));
        assertEquals(expected,mapExercises.mapStringBoolean2(actual));
    }


    @Test
    public void mapStringBoolean_allTheSame_test(){
        String[] actual = new String[]{"c","c","c","c"};

        Map<String,Boolean> expected = new HashMap<>();
        expected.put("c",true);

        assertEquals(expected,mapExercises.mapStringBoolean(actual));
        assertEquals(expected,mapExercises.mapStringBoolean2(actual));
    }

    @Test
    public void mapStringBoolean_allFalse_test(){
        String[] actual = new String[]{"a","b","c"};

        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a",false);
        expected.put("b",false);
        expected.put("c",false);

        assertEquals(expected,mapExercises.mapStringBoolean(actual));
        assertEquals(expected,mapExercises.mapStringBoolean2(actual));
    }



}