import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,4,5,6,7);
        List<String> strings = List.of("John","Kate");

        List<Integer> actual1 = new ArrayList<>();
        List<Integer>actual2 = new ArrayList<>();
        actual2.add(2);
        actual1.add(2);
        Homework homework = new Homework();
      //  System.out.println(homework.compareYesNo(actual1,actual2));



    }


      /*
        Задача 1
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No,
 где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i. Например, {1,2,3,4} и {5,2,3,8}
  вернет {No, Yes, Yes, No}
Протестировать.
         */

    public List<String> compareYesNo(List<Integer>list1, List<Integer>list2){
        List<String> resultYesNo = new ArrayList<>();

        for( int i = 0; i < list1.size();i++){
           // if( list1.get(i).equals(list2.get(i))) {
            if( list1.get(i).equals(list2.get(i))) {
                resultYesNo.add("Yes");
            }
            else resultYesNo.add("No");
        }
        return resultYesNo;
    }
}
