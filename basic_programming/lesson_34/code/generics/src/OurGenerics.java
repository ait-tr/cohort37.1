public class OurGenerics {
    /*
    Обобщения, Дженерики, Generics
     */
    public static void main(String[] args) {
        Person<Integer> person1 = new Person<>("John",1);
       // Person<String> person1 = new Person<>("John",1);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        int personAge =(int) person1.getAge();

        Person<String> person2 = new Person<>("Jack","twenty yerars old");
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
      //  int personAge1 =(int) person2.getAge();

        // обобщенные методы
        Display display = new Display();
        Integer[] ints = {1,2,3,4,5};

        display.<Integer>display(ints);

        String[] strings = {"Tom","Jack","John"};
        display.display(strings);

        Person2<Integer,String> personNew = new Person2<>("John",12);

    }
}
