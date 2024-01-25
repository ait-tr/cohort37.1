import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        Practice practice = new Practice();
        int[] arr = {7,7,6,7,6};
        System.out.println(practice.findDominant(arr));
        System.out.println(practice.findDominantMerge(arr));
    }

    /*
Есть массив с положительными целыми числами. Написать метод, находящий такой элемент (если он есть)
который встречается в массиве >lenght/2.
Если такого нет, метод должен вернуть -1. При решении использовать мапу.
[7,7,6,7,6] - 7    map:  7 = 3 , 6 = 2
[3,2,2,3] - -1
[4,4] -4
 */

    public int findDominant( int[] ints){
        Map<Integer,Integer> occurencesByNumber = new HashMap<>();
        for( int i = 0; i < ints.length; i++){
                    if( occurencesByNumber.containsKey(ints[i])){
                        occurencesByNumber.put(ints[i], occurencesByNumber.get(ints[i]) + 1);
            }
            else occurencesByNumber.put(ints[i],1);
        }
        for(int key: occurencesByNumber.keySet()){
            if(occurencesByNumber.get(key) > ints.length/2)
                return key;
        }
        return -1;
    }

    public int findDominantMerge( int[] ints){
        Map<Integer,Integer> occurencesByNumber = new HashMap<>();
        for(int i : ints){
        int result = occurencesByNumber.merge(i,1,(oldValue,newValue)->oldValue + 1);
            if( result > ints.length/2){
                return i;
            }
        }
        return -1;
    }
}
