import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {


    @Test
    public void test_SizePutNewElts(){
        OurMap<Integer,String> actual = new OurHashMap<>();
        actual.put(3,"f");
        actual.put(2,"b");
        actual.put(1,"c");

        assertEquals(3,actual.size());
    }

    @Test
    public void test_SizePutEmpty_noElements(){
        OurMap<Integer,String> actual = new OurHashMap<>();


        assertEquals(0,actual.size());
    }


    @Test
    public void test_SizePutNotEmpty_nonExistingKey(){
        OurMap<Integer,String> actual = new OurHashMap<>();
        actual.put(3,"a");
        actual.put(2,"b");
        actual.put(1,"c");
        assertEquals(3,actual.size());
        actual.put(4,"d");
        assertEquals(4,actual.size());
    }


    @Test
    public void test_SizePutNotEmpty_existingKey(){
        OurMap<Integer,String> actual = new OurHashMap<>();
        actual.put(3,"a");
        actual.put(2,"b");
        actual.put(1,"c");
        assertEquals(3,actual.size());
        actual.put(2,"d");
        assertEquals(3,actual.size());
    }


    @Test
    public void test_getContainsNotEmpty_ExistingKey(){
        OurMap<Integer,String> actual = new OurHashMap<>();
        actual.put(1,"a");
        actual.put(2,"b");
        actual.put(3,"c");
        assertEquals("a",actual.get(1));
        assertEquals("b",actual.get(2));
        assertEquals("c",actual.get(3));

    }

    @Test
    public void test_getContainsNotEmpty_notExistingKey(){
        OurMap<Integer,String> actual = new OurHashMap<>();
        actual.put(1,"a");
        actual.put(2,"b");
        actual.put(3,"c");
        assertNull(actual.get(5));


    }


    @Test
    public void test_getContainsEmpty_notExistingKey(){
        OurMap<Integer,String> actual = new OurHashMap<>();

        assertNull(actual.get(5));
    }


    @Test
    public void test_removeNotEmpty_existingKey(){
        OurMap<Integer,String> actual = new OurHashMap<>();
        actual.put(1,"a");
        actual.put(2,"b");
        actual.put(3,"c");
        assertEquals(3,actual.size());
        actual.remove(2);
        assertEquals(2,actual.size());
        assertNull(actual.get(2));
    }

    @Test
    public void test_removeNotEmpty_nonExistingKey(){
        OurMap<Integer,String> actual = new OurHashMap<>();
        actual.put(1,"a");
        actual.put(2,"b");
        actual.put(3,"c");
        assertEquals(3,actual.size());
        actual.remove(5);
        assertEquals(3,actual.size());
        assertNull(actual.get(5));


    }



}