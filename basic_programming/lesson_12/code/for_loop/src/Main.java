public class Main {
    public static void main(String[] args) {
        //  print10();

        //int i,j;

        for (int i = 1, j = 10; i <= j; i++, j--) {
            //    System.out.println(" i: " + i +"  ,j: " + j );
        }

        for (int i = 0; i < 5; ) {

            System.out.println(i);
            i++;
        }


        int y = 0;

        for (; y < 5; ) {

            System.out.println(y);
            y++;
        }

        for (; ; ) { //  бесконечный цикл


        }


        //   цикл For
    /*
    for( initialization; condition; incr/decr )
    initialisation -  обьявление и присвоение начального значения переменной (счетчику)
                        Выполняется один раз в начале цикла

    condition - условие, определяющее будет ли выполняться цикл. Цикл выполняется пока условие = true

    incr/decr -  определяет изменение переменной-счетчика
     */




    }

    static void print10 () {
        // int i = 1;
        // while(i <= 10){
        // System.out.print(i + " ");
        //    i++;
        // }
        //  int n = 1;
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // System.out.println(i);
    }
}
