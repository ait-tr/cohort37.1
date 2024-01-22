import java.util.*;

public class AnagramList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("john");
        names.add("mary");
        names.add("jonh");
        names.add("bill");
        names.add("njoh");
        names.add("amry");

        AnagramList anagramList = new AnagramList();
        System.out.println(anagramList.findAnagrams("john",names));
        System.out.println(anagramList.findAnagrams("evg",names));
    }

    /*
    Написать метод, который принимает список имен и их анаграмм и имя, по которому
    он возвращает список всех его анаграмм, включая само имя.
     При решении использовать мапу.

Пример: [john, mary, ,jonh, bill, njoh, amry],
john -> [john,jonh,njoh] (все буквы в словах маленькие)

honj = [john,jonh,njoh]
amry = [mary,amry]
bill = [bill]
     */

   public List<String> findAnagrams( String name,List<String>strings){
        Map<String,List<String>>anagrams = new HashMap<>();

        for(String s : strings){
            String sortedKey = sortAnagram(s);
            if(anagrams.containsKey(sortedKey)){
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey,value);
            } else{
                List<String>value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey,value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(name),List.of());
    }

    private String sortAnagram(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
