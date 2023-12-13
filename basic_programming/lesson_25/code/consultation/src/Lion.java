public class Lion extends Animal {

    int lengthOfMane;

    public Lion(String art, int age, String colour, boolean predator,int lengthOfMane){
        super(art,age,colour,predator);

        this.lengthOfMane = lengthOfMane;
    }

    public void move(){
        System.out.println("Lion runs very fast");
    }

    public void sleep(){
        System.out.println("Lion sleeps in the day time");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "lengthOfMane=" + lengthOfMane +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", predator=" + predator +
                '}';
    }
}
