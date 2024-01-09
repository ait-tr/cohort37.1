public class PersonInt<T> implements Personasable<T> {
//public class PersonInt implements Personasable<Integer> {

    private String name;
    private T age;

    public PersonInt(String name, T age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public T getAge() {
        return age;
    }
}
