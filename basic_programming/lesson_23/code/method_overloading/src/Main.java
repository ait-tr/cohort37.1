public class Main {

    // перегрузка методов (  method overloading)
    /*
     - это свойство, позволяющее иметь в одном и том же  классе методы с одинаковым названием,
     но с разным числом, последовательностью или типом параметров

     Три варианта:
     1. разное количество параметров
     */
    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);


      //  Person person0 = new Person();
      //  Person person1 = new Person("John",25);
      //  Person person2 = new Person("Jack",35,180);
      //  Person person3 = new Person("Bill",45,180,80);
      //  System.out.println(person0);
      //  System.out.println(person1);
      //  System.out.println(person2);
      //  System.out.println(person3);

      //  Person person2 = new Person()
      //  System.out.println(person0);

        Employee john = new Employee();
        john.displayEmployee();

    }
    static int sum( int x, int y){
        return x + y;
    }

    static int sum( int x, int y, int z){
        return x + y + z;
    }

    //2. разный тип параметров
    static int sum(float x, float y){
       // return (int) (x + y);
        return (int) (x + y);
    }

    static int sum( float x, int y){
        return (int) (x + y);
    }

    //3. разная последовательность
    static int  sum( int x, float y){
        return (int ) (x + y);
    }

    //static int  sum( int abc, float def){
    //    return (int ) (x + y);
    //}

    // возможность перегрузки методов по типу возвращаемого имя значния отсутствует
    //static float sum( int abc, float def){
   // }
}
