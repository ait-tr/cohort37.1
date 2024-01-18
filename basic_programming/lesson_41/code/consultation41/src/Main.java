import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(50);
        names.add(0,"Marry");
        names.add(1,"Marry");
        names.add(2,"John");

        System.out.println(names);
        names.add(1,"Ann");
        System.out.println(names);
    }
    public static List<String> returnNewList(List<String> names){
        Set<String> set = new HashSet<>(names);
        return new ArrayList<>(set);


    }

    /*
    C использованием множеств написать метод, который вернет из списка
    имен повторяющиеся элементы
    {John, Mary, Peter, John, ,John, Mary, Ann} -> John, Mary
     */
    public List<String> getDuplicates( List<String> input){
        Set<String> set = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        for(String s : input){
            if( !set.add(s) && !duplicates.contains(s))
                duplicates.add(s); // John Mary
        }
        return duplicates;
    }

    /*
       Есть массив с положительными целыми числами. Написать метод, находящий такой элемент
       ( если он есть), который встречается в массиве > length/2 (  доминантный). Если такого нет метод
       должен вернуть -1
       7,7,4,4,7  -> 7
       4,4 -> 4
       2,6 -> -1
       6 -> 6
       При решении использовать мапу !

     */
}
