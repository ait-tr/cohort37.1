import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {

    OurArrayList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new OurArrayList<>();
    }

    @Test
    public void testAppendGet_emptyList_addsOneElement(){
        list.append(5);
        assertEquals(5,list.get(0));
    }

    @Test
    public void testAppendGet_emptyList_addsSeveralElement(){
        Integer[] expected ={1,3,10,4,7,20};

        for(int i = 0; i < expected.length; i++){
            list.append(expected[i]);
        }

        for(int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.get(i));
        }
    }

    @Test
    public void testSize_emptyList_appendsOneElt(){
      //  list.append(12);
        assertEquals(0,list.size());
    }

    @Test
    public void testSize_emptyList_appendsSeveralElt(){
        Integer[] expected ={1,3,10,4,7,20};

        for(int i = 0; i < expected.length; i++){
            list.append(expected[i]);
        }

        assertEquals(expected.length, list.size());
    }

    @Test
    public void testSet_oneElement_replacesElement(){
        list.append(1);
        list.set(10,0);

        assertEquals(10, list.get(0));
    }

    @Test
    public void testSet_severalElement_replacesFirstLastMiddleElement(){
        Integer[] source ={1,3,10,4,7,20};

        for(int i = 0; i < source.length; i++){
            list.append(source[i]);
        }

        list.set(100,0);
        list.set(200,3);
        list.set(300,5);

        Integer[] expected = {100,3,10,200,7,300};

        for(int i = 0; i < expected.length; i++){
            assertEquals(expected[i], list.get(i));
        }
        assertEquals(6,list.size());
    }

    @Test
    public void testGet_nonEmptyList_getWrongIndex(){
        list.append(2);
        list.append(23);
        list.append(21);

        assertNull(list.get(5));
    }

    @Test
    public void testRemoveById_nonEmptyList_removesByWrongIndex(){
        list.append(2);
        list.append(23);
        list.append(21);

        assertNull(list.removeById(5));
    }


    @Test
    public void testRemoveById_nonEmptyList_removesFirstElt(){
        list.append(2);
        list.append(23);
        list.append(21);

        int removed = list.removeById(0);
        assertEquals(2,removed);
    }

    @Test
    public void testRemoveById_nonEmptyList_removesMiddleElt(){
        list.append(2);
        list.append(23);
        list.append(21);

        int removed = list.removeById(1);
        assertEquals(23,removed);
    }

    @Test
    public void testRemoveById_nonEmptyList_removesLastElt(){
        list.append(2);
        list.append(23);
        list.append(21);

        int removed = list.removeById(2);
        assertEquals(21,removed);
    }

    @Test
    public void testRemove_nonEmptyList_removesFirstElt(){
        list.append(2);
        list.append(23);
        list.append(21);

        assertTrue(list.remove(2));
        assertFalse(list.remove(34));

        OurList<String> names = new OurArrayList<>();
        names.append("Jack");
        names.append("John");
        names.append("Bill");

        assertTrue(names.remove("Jack"));
        assertFalse(names.remove("Peter"));

    }

}