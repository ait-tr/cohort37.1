import java.util.*;

public class Main {
    // Set
    /*
    Set -  это коллекция, в которой не могут содержаться дубликаты

    HashSet
    1. Не гарантирует порядок, в котором хранятся и возвращаются элементы
    2. не допускает дубликатов
    3. можно поместить null
     */
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // HashSet(Collection) - создается сет в который копируются элементы коллекции

        // добавление элементов add()
        System.out.println(hashSet.add("aaa"));
        System.out.println(hashSet.add("aaa"));
        hashSet.add("bbb");
        hashSet.add("ccc");
        hashSet.add("ddd");

        System.out.println(hashSet);

        System.out.println("with for-each");
        for(String s : hashSet)
            System.out.println(s);

        // удаление элемента remove()
        hashSet.remove("ccc");
        System.out.println(hashSet);

        System.out.println(hashSet.size());

        System.out.println(hashSet.contains("aaa"));
        System.out.println(hashSet.contains("aae"));

        System.out.println(hashSet.isEmpty());

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        hashSet.clear();
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);


        //LinkedHashSet -  поддерживает порядок ввода элементов
        Set<String> nameSet = new HashSet<>();
        nameSet.add("John");
        nameSet.add("Jack");
        nameSet.add("Bill");
        nameSet.add("Ann");
        System.out.println(nameSet);
      //  Collections.sort(nameSet);
        List<String> list = new LinkedList<>(nameSet);
        Collections.sort(list);

        System.out.println("LinkedHashSet");
        Set<String>nameSet1 = new LinkedHashSet<>();
        nameSet1.add("John");
        nameSet1.add("Jack");
        nameSet1.add("Bill");
        nameSet1.add("Ann");

        System.out.println(nameSet1);

        // TreeSet -  сортирует элементы
        System.out.println("with TreeSet");
        Set<String> treeSet = new TreeSet<>(nameSet);
        System.out.println(treeSet);
    }
}
