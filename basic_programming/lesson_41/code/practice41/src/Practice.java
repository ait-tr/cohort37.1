import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        Practice practice = new Practice();
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Ann");
        list.add("John");
        list.add("Ann");
        list.add("Bill");
        System.out.println(practice.removeDuplicates(list));
    }
    /*
    1.C  использованием множеств ( Set)  написать метод, который вернет лист без
    повторяющихся элементов
    Пример: { "John", "Mary", Peter, John, Ann, Mary} -> {John, Mary, Peter,Ann}
    List<String> removeDuplicates( List<String> input)
    */
    public List<String> removeDuplicates(List<String> input){
        Set<String> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }



    /*
    2. Задача на мапы:
    Дан список имен, в котором некоторые имена повторяются. Написать метод, который по имени вернет количество
        вхождений  этого имени в список.
      int  findNameOccurence( List<String> list, String name)

     */
}
