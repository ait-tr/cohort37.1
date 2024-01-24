public class Main {
   /*
    Method references ( ссылки на методы)

    1. Ссылки на статические методы
     ClassName :: methodName

    2. Ссылки  instance method references

    */
   public static void main(String[] args) {
       int[] ints = {-6,-2,1,3,4,6};
       ExampleInterface exampleInterface = ExampleClass::isEven;
     //  System.out.println(findSumCondition(ints,ExampleClass::isPositive));

     //  System.out.println(findSumCondition(ints,ExampleClass ::isEven));

       ExampleClass2 exampleClass2 = new ExampleClass2();
    //   System.out.println(findSumCondition(ints,exampleClass2::isPositive));

       // ссылки на конструктор
       PersonCreator personCreator = Person::new;
       Person person = personCreator.create("John");

       System.out.println(person.getName());
   }

    public static int findSumCondition(int[] ints, ExampleInterface example)
    {
        int sum = 0;

        for( int i : ints)
        {
            if(example.isEqual(i))
                sum += i;
        }
        return sum;

    }
}
