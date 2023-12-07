public class Main {

    // Static в Джава.
    // static  означает, что переменная/метод принадлежит самому классу а не обьектам класса. Это означает, что создается
    // только один экземпляр такой переменной, который используют все обьекты класса

    public static void main(String[] args) {
        Person person1 = new Person("John",35);
        Person person2 = new Person("Mike",25);

        System.out.println("The number of persons created is " + Person.counter);// доступ к статическим переменным и методам из других классов осуществляется
                                            // через имя класса

        person1.canTalk();
        Person.sum();
       // Math.


    }
}
