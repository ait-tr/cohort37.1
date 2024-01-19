import java.io.IOException;

public class Main {
    /*
    Exceptions -  Исключения

    Ошибки наследуют класс Throwable и делятся на ошибки, возникающие в
    джава-машине ( вне нашего контроля) и исключения.
    Исключения можно обрабатывать в программе

    Типы исключений
    Исключения бывают "встроенные" и написанные программистом

    Встроенные исключения делятся на две категории:
    Checked( проверяемые)
    Unchecked Exceptions ( непроверяеме исключения)

    Важные термины при работе с исключениями:
    1. try - код, который может вызвать появление исключения помещается внутрь блока try
        Блок try  определяет произошло ли исключение и если произошло, то выполнение программы переходит в соответствующий
         блок catch  или блок finally
    2. catch - блок, содержащий код для обработки возникшего исключения. Блок catch выполняется в случае,
        если произошло исключение и существует в связке с блоком try
    3. finally - выполняется всегда независимо от того, произошло исключение или нет

    4. throw -  используется  для того, чтобы бросить исключение
    5. throws -  используется в сигнатуре метода и указывает на то, что метод может бросить исключение

    TRY - CATCH БЛОК

        try{
        блок кода
        } catch( Exception e){
           код для обработки этого исключения}
     */
    public static void main(String[] args)  {
        int n1 = 10;
        int n2 = 0;

        int[]ints = {1,2};

        try {
          //  int divide = n1/n2;
          //  System.out.println(divide);
         //   System.out.println(ints[10]);

        //    String nullString = null;
        //    nullString.length();

        //    int divide = n1/n2;
        //    System.out.println(divide);

        }

        catch (ArithmeticException e)
        {
            System.out.println("Do not divide by zero !");

        }

        catch (NullPointerException e){
            System.out.println("NULL !!!");
            System.out.println(e.getMessage());
        }

   /*     catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds !");
            System.out.println(e.getMessage());
        }

    */

        catch (Exception e){
            System.out.println("Exception is caught !");
            System.out.println(e.getMessage());
        }

     //   System.out.println("After catch bloc");

        int[] nums ={4,8,16,32,64,128,256,512};
        int[] div = {2,0,4,8,0,8};

        for( int i = 0; i < nums.length; i++){
            try {
            //    System.out.println(nums[i] + "/" + div[i] + " = " + nums[i] / div[i]);
            }
            catch (ArithmeticException exception){
                System.out.println("Shouldn't divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("The second array is finished and no elements left ");
            }
        }

        // блок finally -  код блока finally  выполняется всегда
        /*
         try{
         }
         catch{}

         finally{}
         */

        try{
            int a = 10/2;
        }
    //    catch (ArithmeticException e){
    //        System.out.println(e.getMessage());
     //   }

        finally {
     //       System.out.println("This is a finally bloc");
        }

      //  System.out.println("out of try-catch-finally");


        /*
        1. finally  не существует без блока try
        2. finally не является обязательным
        3. если исключение не происходит, то finally  выполняется вслед за блоком try, если происходит то
            после catch
        4. finally выполняется даже в том случае, если в try  есть команды return,break, continue
        5. блок try-finally  может существовать без catch
         */

     //   printSmth();

        // throw -  бросать исключение
        // throw new exception_class( "message")

     //   checkCandidates(9,20);

        try {
            method1(1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void printSmth(){

        try {
            System.out.println(10/2);
            return;
        }
        finally {
            System.out.println("I am finally method");
        }
    }

    public static void checkCandidates( int age, int weight){

        if( age < 10 && weight < 30){
            throw new ArithmeticException("Sorry, you are not good for this section");

        }
        else{
            System.out.println("Welcome to our club !");
        }
    }

    public static void method1(int n) throws IOException,ClassNotFoundException{
        if(n == 10)
            throw new IOException("IO Exception occured");
        else
            throw new ClassNotFoundException("Class not found");
    }
}
