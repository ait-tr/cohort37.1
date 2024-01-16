import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OurListIterator {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Paris");
        cities.add("Rome");
        cities.add("Madrid");

        ListIterator<String> listIterator = cities.listIterator();

        System.out.println("Cities before change:");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //  текущий элемент сейчас Madrid.  Изменим его
        listIterator.set("London");

        System.out.println();
        System.out.println("Cities after, reversed");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
