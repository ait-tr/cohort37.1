public class Main {

    /*
    Классы-обертки (Wrapper classes) - это классы, "оборачивающие" примитивные типы
     примитивные типы boolean byte  int     char      long  float double  short
    классы-обертки    Boolean Byte  Integer Character Long  Float Double  Short
     */
    public static void main(String[] args) {
        Integer intObject = new Integer(1); // c  помощью конструктора
        System.out.println(intObject);

        Integer intObject1 = Integer.valueOf(1);
        System.out.println("value of intObject1 is " + intObject1);

        // autoboxing and unboxing -  автоматическое преобразование типов

        Integer intValue3 = 3;

        printInteger(1);

      //  for( Integer i = 0; i < 10; i++){ // так не надо
        for( int i = 0; i < 10; i++){
            System.out.println(i);
        }

        //Integer.MAX_VALUE
        // 2aert4
    }

    public static void printInteger( Integer integer){
        System.out.println(integer);
    }

}
