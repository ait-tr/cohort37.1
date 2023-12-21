public class ConstantUsage implements Constants {

    public static void main(String[] args) {
        for(int i =MIN; i < MAX; i++){
            System.out.println(i);
        }
        int y = 16;
        if(y > 15)
            System.out.println(ERROR);
    }
}
