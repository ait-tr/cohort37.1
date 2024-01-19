import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {

    /*
    Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
    Написать метод, который по имени вернет количество вхождений этого имени
    в список. т.е. метод принимает лист и имя и возвращает число,
    соответствующее количеству раз , которое это имя встречается в листе

    John, Mary, Ann, Mary,John,John
     */
    // John=3, Mary=2, Ann=1,
    public int findNameToNumberOccurence(List<String> strings, String name){
        Map<String,Integer> nameToNumber = new HashMap<>();

        for(String s : strings){
            if( nameToNumber.containsKey(s))
                nameToNumber.put(s, nameToNumber.get(s) +1 );
            else nameToNumber.put(s,1);
        }

        return nameToNumber.getOrDefault(name, 0);
    }
}
