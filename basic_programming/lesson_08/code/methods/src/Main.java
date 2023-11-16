public class Main {
    public static void main(String[] args) {

      //  hello();
      //  hello();
        walk("John",35); // вызов метода
        walk("Mary",20);
       // walk();
       // walk(23,"Tom");
        int x = 2;
        int y = 3;
        int result = sum(1,2); // вызов метода
        System.out.println("Result of sum method is " + result);
        System.out.println("Result 2 of sum method is " + sum(x,y));
      //  sum("hello",1);
       String res =  sayHello("John");
        System.out.println(res);

    }

    //  создать один метод в другом нельзя !
   static void hello(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Java");
        System.out.println("My name is");
        System.out.println("Evgeny");
        System.out.println("Hello");
        System.out.println("Java");
        System.out.println("My name is");
        System.out.println("Evgeny");
    }

    static void walk(String name, int age){
        System.out.println( name + " can walk." + " He/She is " + age);
    }

    static int sum(int a, int b){

        int plus = a +b;
        int minus = a - b;
      //  System.out.println(plus);
      //  System.out.println(minus);

        return plus;

    }

    static String sayHello (String name){
        return "Hello, " + name + " !";

    }

}
