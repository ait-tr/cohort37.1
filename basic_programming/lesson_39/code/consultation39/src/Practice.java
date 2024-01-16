import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Practice {

    /*
    1.  есть список с именами : John, Ann, Bill, Benjamin. Написать метод, который вернет лист , в котором не содержатся
        имена исходного списка длиной 4
        */

    public List<String> withoutNamesLength4( List<String> list){
        List<String> res = new ArrayList<>();

        for(String s : list){
            if(s.length() != 4)
                res.add(s);
        }
        return res;
    }

    public List<String> withoutNamesLength4Iterator( List<String> list){
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            if(iterator.next().length() == 4)
                iterator.remove();
        }
        return list;
    }
    /*
    2.  Есть   упорядоченный лист целых чисел. Написать метод, возвращающий true  если в листе есть 2  таких числа, что их произведение
        равно заданному числу n
        public boolean containsProduct( List<Integer> numbers, int product)
        [2,5,18,19,55],36 -> true
        [2,5,18,55],40 -> false

     */
    public static boolean  containsProductEff( List<Integer> numbers, int product){
       // Collections.sort(numbers);

        int i = 0;
        int j = numbers.size() - 1;

        while( j - i > 0){
            int mul = numbers.get(i) * numbers.get(j);

            if(mul < product){
                i++;
            }else if (mul > product){
                j--;
            }else
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(2,5,18,55);

        System.out.println(containsProductEff(ints,36));

    }

    public static boolean containsProduct(List<Integer> numbers, int product){
        for(int i = 0; i < numbers.size(); i++ ){
            for(int j = i + 1; j < numbers.size();j++){
                if(numbers.get(i)*numbers.get(j) == product)
                    return true;
            }
        }
        return false;
    }
}
