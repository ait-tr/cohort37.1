import java.util.Arrays;

public class RemoveEltArray {

    public static void main(String[] args) {


        int[] ints = {1, 6, 5};
        int index = 0;

        for (int i = index + 1; i < ints.length; i++){
            ints[i-1] = ints[i];
        }
        ints[ints.length - 1 ]=0;

        System.out.println(Arrays.toString(ints));

    }
}
