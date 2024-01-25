import java.util.HashMap;
import java.util.Map;

public class MergeMethodDemo {

    /*
     метод merge()

     Map hashMap = new HashMap()
     hashMap.merge(key,value, remappingFunction)

     параметры:
     key -  ключ, по которому нужно положить значение value
     value - значение связанное с ключом key
     remapping function - используется в случае, если ключ key уже существует

     Метод просто добавляет значение value  по ключу key   если такого ключа в мапе нет.
     Если есть, то с помощью remapping function определяется каким будет новое значение value
     */
    public static void main(String[] args) {
        Map<String,Integer> items = new HashMap<>();

        items.put("Desktop",1000);
        items.put("TVset",600);
        items.put("Mouse",30);

        System.out.println(items);

        items.merge("Phone",250,(oldValue,newValue)->oldValue + newValue);

        System.out.println(items);

        items.merge("Desktop",500, Integer::sum);
        System.out.println(items);


        Map<String,String> cities = new HashMap<>();
        cities.put("Berlin","Germany");
        cities.put("Paris","France");
        cities.put("London","England");

        System.out.println("Countries:");
        System.out.println(cities);

        cities.merge("London","GreatBritain",(oldValue,newValue)-> oldValue +"/" + newValue);
        cities.merge("Madrid","Spain",(oldValue,newValue)-> oldValue +"/" + newValue);

        System.out.println("Countries changed");
        System.out.println(cities);

        System.out.println("With forEach");
        cities.forEach((key,value) -> System.out.println("key: " + key +" value:" + value));


        Map<String,Integer> items1 = new HashMap<>();
        items1.put("Desktop",600);
        items1.put("Mouse",150);

        Map<String, Integer> items2 = new HashMap<>();
        items2.put("TVset",800);
        items2.put("Mouse",100);

        items2.forEach((key,value)-> items1.merge(key,value,(oldValue,newValue)->{

            if(oldValue < newValue)
                return oldValue;
            else
                return newValue;
        }));

        System.out.println("merged map");
        items1.forEach((key,value) -> System.out.println("key: " + key +" value:" + value));
    }
}
