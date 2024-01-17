import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

     /*
     Map  мапа, словарь, ассоциативный массив

     Лист:
      индексы       0  1  2  3
      значения      а  б  в  г

      Мап:
      ключ          "Джон  Билл   Энн   Кейт
      значение       23     45    56     87

      Интерфейс Map
       4 класса:
       HashTable
       HashMap
       LinkedHashMap
       TreeMap

       мапа представляет собой набор пар ключ-значение
       В качестве ключей и в качестве занчений могут быть разные типы данных
       Ключи в мапе уникальны, а значения могут повторяться

        HashMap
         */
     public static void main(String[] args) {
         Map<Integer,String> items = new HashMap<>();
         System.out.println(items);

         // добавить элемент в мапу put()
         items.put(700,"TV");
         System.out.println(items);
         items.put(1500,"Notebook");
         items.put(200,"Printer");
         System.out.println(items);
         items.put(1500,"DeskTop");
         System.out.println(items);

         // получить элемент по ключу  get()
         System.out.println(items.get(200));

         // размер
         System.out.println(items.size());

         // удалить элемент remove()
         items.remove(200);
         System.out.println(items);

         items.put(150,"Mouse");
         items.put(100,"Keybord");

         // проверка наличия ключа
         System.out.println(items.containsKey(700));
         System.out.println(items.containsKey(800));

         // проверка наличия значения
         System.out.println(items.containsValue("TV"));

         // получение набора ключей
         System.out.println(items.keySet());
         System.out.println();

         // получить все значения
         System.out.println(items.values());

         System.out.println();
         // получить набор ключ-значение( entries)
         System.out.println("-------------EntrySet:-----------------");
         System.out.println(items.entrySet());
         System.out.println();

         // перебор элементов мапы
         // 1-  используя набор ключей
         System.out.println("Iterating map");
         for( Integer key : items.keySet()){
             System.out.println(key +" : " + items.get(key));

         // 2 - c помощью набора пар ключ-значение
             System.out.println("Iterating with EntrySet");
         for(Map.Entry<Integer,String> entry : items.entrySet()){
             Integer k = entry.getKey();
             String v = entry.getValue();

             System.out.println(k + ":" + v);
         }

         }


         // TreeMap - элементы хранятся в упорядоченном виде
         Map<String,String> treeMap = new TreeMap<>();
       //  treeMap.putAll(items);
         treeMap.put("Snow","John");
         treeMap.put("Black","Mike");
         treeMap.put("Apple","Kate");
         treeMap.put("White","John");
         System.out.println(treeMap);

         //LinkedHashMap -  сохраняет порядок ввода
         System.out.println("items");
         System.out.println(items);
         System.out.println();
         System.out.println("Linkedhashmap");
         Map<String,String>  linkedHashMap= new LinkedHashMap<>();
         linkedHashMap.put("Snow","John");
         linkedHashMap.put("Black","Mike");
         linkedHashMap.put("Apple","Kate");
         linkedHashMap.put("White","John");
         System.out.println(linkedHashMap);
     }


}
