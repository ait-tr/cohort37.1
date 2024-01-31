import java.util.Iterator;

public class OurListDemo {
    public static void main(String[] args) {
        OurList<Integer> list = new OurLinkedList<>();

        list.append(6);
        System.out.println(list.get(0));

        list.set(10,0);
        System.out.println(list.get(0));

        list.append(5);
        list.append(4);
        list.append(6);
        list.append(1);
        list.append(8);
        list.append(50);

        System.out.println(list.contains(50));
        System.out.println(list.remove(50));
        System.out.println(list.contains(50));
        list.removeById(0);
        System.out.println(list.get(0));
        System.out.println(list.contains(10));

        System.out.println("With for-each");
        for( int i: list){
            System.out.println(i +" ");
        }

        System.out.println();
        System.out.println("with iterator");

       Iterator<Integer> iterator = list.iterator();
       wh
    }
}
