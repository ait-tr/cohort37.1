public class Snake extends Animal {

    boolean poisonous;
    int length;

    public Snake(String art, int age, String colour, boolean predator, boolean poisonous, int length){
        super(art,age,colour,predator);
        this.poisonous = poisonous;
        this.length = length;
    }

    public void move(){
        System.out.println("Snake crawls");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "poisonous=" + poisonous +
                ", length=" + length +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", predator=" + predator +
                '}';
    }
}
