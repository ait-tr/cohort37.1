public class Animal {
    String art;
    int age;
    String colour;
    boolean predator;


    public Animal(String art, int age, String colour, boolean predator){
        this.art = art;
        this.age = age;
        this.colour = colour;
        this.predator = predator;

    }

    public void move(){
        System.out.println("An animal can move");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "art='" + art + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", predator=" + predator +
                '}';
    }
}
