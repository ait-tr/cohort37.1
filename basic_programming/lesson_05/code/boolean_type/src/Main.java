public class Main {

    public static void main(String[] args) {

        //  тип boolean . Имеет два значения - true,false
        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b );

        // Relational and Logical operators
        //  операторы сравнения и логические операторы

        /*
        relational operators
        ==   равенство
        !=   не равно
        >    больше
        <    меньше
        >=   больше равно
        <=   меньше равно

        logical operators

        &    AND ( И )
        |     OR ( ИЛИ )
        !     NOT ( НЕ )
        ^     XOR (  исключающее ИЛИ)


        &&
        ||


         */
        int i = 10;
        int j = 10;
       boolean result = i == j;
       result = i != j;
       result = i > j;
       result = i < j;
       result = i >= j;
       result = i <= j;
      // true > false

        boolean p = true;
        boolean q = false;
        System.out.println(p&q);
        System.out.println(p^q);

        q = true;
        System.out.println(p^q);


        if( 10>9) { //  код, идущий в фигурных скобках за условным оператором if  будет выполняться только
            // в том случае, когда выражение в круглых скобках true,  а если оно ложно, то этот код игнорируется
            System.out.println("10 >9 ");
        }
      //  System.out.println(10>9);

        int n , d;

        n = 10;
        d = 5;
      //  System.out.println(n % d == 0);

        if( d != 0 && (n % d) == 0){
            System.out.println( " can be divided without remainder");
        }
        int i1 = 0;







    }
}
