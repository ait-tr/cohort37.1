import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        for( int i = 1; i <=43; i++) {
         //   System.out.println(i % 10);
        }

            Map<Integer,String> map = new HashMap<>();
            map.put(2,"Hello");
            map.put(2,"Java");
          //  System.out.println(map);

        OurMap<Integer,String>ourMap = new OurHashMap<>();
        ourMap.put(3,"d");
        ourMap.put(2,"b");
        ourMap.put(1,"a");

        System.out.println(ourMap.size());
        System.out.println(ourMap.get(1));
        System.out.println(ourMap.get(2));
        System.out.println(ourMap.get(3));

        System.out.println(ourMap.remove(1));
        System.out.println(ourMap.contains(9));

        System.out.println(ourMap.contains(1));
        System.out.println(ourMap.get(1));
        System.out.println(ourMap.get(3));


    }
}
