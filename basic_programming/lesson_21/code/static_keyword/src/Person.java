public class Person {
    public static void main(String[] args) {
        sum();
    }
    String name;
    int age;

    public static int counter;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        counter++;
    }

    public void canTalk(){
        System.out.println(name +" can talk");
    }

    public static void sum (){
        System.out.println(1+2);
    }
}
