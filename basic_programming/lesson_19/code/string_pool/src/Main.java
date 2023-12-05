public class Main {

    public static void main(String[] args) {
        String name = "Jack";
        String name1 = new String("Jack");
        String name2 = new String("Jack");
        System.out.println(name2 == name1);
        String name3 = "Jack";
        System.out.println(name == name3);

    }
}
