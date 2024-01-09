public class Person<T> {
/*
Буква T  указывает на то, что тип Т будет использоваться этим классом. Т в угловых скобках называется
универсальным параметром, так как его можно заменить любым типом
 */
    private String name;
  //  private int age;
    private T age;

    public Person(String name, T age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}
