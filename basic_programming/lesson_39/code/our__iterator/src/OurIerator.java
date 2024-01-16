import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OurIerator {

    public static void main(String[] args) {
        OurIerator ourIerator = new OurIerator();
        List<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(3);
        ints.add(1);
        ints.add(15);
        System.out.println(ourIerator.returnWithoutElementsMoreNIterator(ints,13));
      //  addNames();
    }

    /*
     методы итератора
     1. hasNext -  возвращает true если в коллекции еще есть элементы
     2. next -  возвращает следующий элемент коллекции. Произойдет ошибка если элементы в
          коллекции закончились. Поэтому как правило он использутся вместе с методом hasNext
     3. remove() -  удаляет элемент из коллекции


     Задача: пусть есть лист целых чисел. Нужно написать метод, который вернет лист без
     элементов больше числа N

     [2,0,34,5,7,56,43],33 -> [2,0,5,7]
     */
 /*  Нельзя изменять коллекцию при ее переборе !
 public static   List<Integer> returnWithoutElementsMoreN( List<Integer>input, int n){
        for(Integer i : input){
            if(i >= n)
                input.remove(i);
        }
        return input;

    }   так нельзя

  */
    public List<Integer> returnWithoutElementsMoreNIterator( List<Integer>input, int n){
        Iterator<Integer> iterator = input.iterator();

        while(iterator.hasNext()){
            if(iterator.next() >= n)
                iterator.remove();
        }
        return input;
    }

    public List<Integer> returnWithoutElementsMoreN( List<Integer>input, int n){
        List<Integer> result = new ArrayList<>();
        for(Integer i : input){
            if( i <= n) result.add(i);
        }
        return result;
    }


    public static void addNames(){
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("John1");
        names.add("John2");

        for(String name: names){
            System.out.println(name);
            names.add("John3");
        }
    }





}
