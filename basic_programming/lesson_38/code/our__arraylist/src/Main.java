public class Main {
    public static void main(String[] args) {
        OurList<Integer> ourList = new OurArrayList<>();
        ourList.append(2);
        ourList.append(4);
        ourList.append(1);
        ourList.append(7);

        for(int i = 0; i < ourList.size(); i++){
            System.out.println(ourList.get(i));
        }

        ourList.set(8765, 2);

        for(int i = 0; i < ourList.size(); i++){
            System.out.println(ourList.get(i));
        }
        System.out.println("remove by id");
        ourList.removeById(1);
        for(int i = 0; i < ourList.size(); i++){
            System.out.println(ourList.get(i));
        }

        System.out.println("remove");
        ourList.remove(8765);
        for(int i = 0; i < ourList.size(); i++){
            System.out.println(ourList.get(i));
        }

        ourList.clear();


        System.out.println("after clear");
        for(int i = 0; i < ourList.size(); i++){
            System.out.println(ourList.get(i));
        }

        System.out.println("after append 1");
        ourList.append(1);
        for(int i = 0; i < ourList.size(); i++){
            System.out.println(ourList.get(i));
        }



    }


}
