import java.util.Arrays;

public class StaticBlocks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seasons));
    }
    public static String[] seasons  = new String[4];

    static {
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";
    }
}
