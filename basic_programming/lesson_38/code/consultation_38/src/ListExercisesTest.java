import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListExercisesTest {

    private ListExercises listExercises;

    @BeforeEach
    public void init(){
        listExercises = new ListExercises();
    }

    @Test
    public void getAddresses_testEmpty(){
        assertEquals(Arrays.asList(),listExercises.getAddresses(Arrays.asList()));

    }


    @Test
    public void getAddresses_testOne(){
        Address address1 = new Address( "Street1",1);
        Person person1 = new Person("Person1", address1);

        List<Address> expected = Arrays.asList(address1);
        List<Person> actual = Arrays.asList(person1);
        assertEquals(expected,listExercises.getAddresses(actual));
    }


    @Test
    public void getAddresses_testSeveral(){
        Address address1 = new Address( "Street1",1);
        Address address2 = new Address( "Street2",2);

        Person person1 = new Person("Person1", address1);
        Person person2 = new Person("Person2", address2);

        List<Address> expected = Arrays.asList(address1,address2);
        List<Person> actual = Arrays.asList(person1,person2);
        assertEquals(expected,listExercises.getAddresses(actual));
    }

}