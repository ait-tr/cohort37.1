import java.util.HashMap;
import java.util.Map;

public class Homework {
    public static void main(String[] args) {
        Homework homework = new Homework();

        Map<String,String> actual = new HashMap<>();
        actual.put("a","Hi");
        actual.put("b","There");

        System.out.println(homework.ab(actual));

    }
    /*
    Дана Map<String, String> map, написать метод, который вернет Мап, такую, что если в исходной map
    есть ключи ‘a’ и ‘b’,
    то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b. Если нет, ничего не менять.
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
     */
    public Map<String,String> ab( Map<String,String> mapAB){
        if( mapAB.containsKey("a") && mapAB.containsKey("b"))
            mapAB.put("ab", mapAB.get("a").concat(mapAB.get("b")));
        return mapAB;
    }
}
