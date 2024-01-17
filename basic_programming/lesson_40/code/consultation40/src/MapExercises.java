import java.util.HashMap;
import java.util.Map;

public class MapExercises {

    /*
    Пусть есть массив строк( не пустой) . Нужно написать метод, принимающий этот массив и возвращающий мапу
    Map<String, Boolean>  где каждая строка массива является ключом, а значением является true  если строка в массиве
    встречается больше одного раза и false  если только один раз
    Примеры :
    ["a","b","a","c","b"] -> { "a" = true, "b" = true, "c" = false}
    ["a","b","c"] -> { "a" = false, "b" = false, "c" = false}
    ["c","c","c"] -> { "c" = true}
     */
    public Map<String,Boolean> mapStringBoolean(String[] strings){
        Map<String,Boolean> nameToBoolean = new HashMap<>();

        for(String s : strings)
        {   if( nameToBoolean.containsKey(s)){
                nameToBoolean.put(s,true);
            }
            else {
            nameToBoolean.put(s, false);
            }
        }
        return nameToBoolean;
    }

    public Map<String,Boolean> mapStringBoolean2(String[] strings){
        Map<String,Boolean> nameToBoolean = new HashMap<>();

        for(String string: strings){
            nameToBoolean.put(string,nameToBoolean.containsKey(string));
        }
        return nameToBoolean;
    }
}
