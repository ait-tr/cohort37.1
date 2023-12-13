public class Bird extends Animal{

    String additionalColour;
    int flyingHeight;

    public Bird(String art, int age, String colour, boolean predator, String additionalColour,int flyingHeight)
    {
        super( art,age,colour,predator);
        this.additionalColour = additionalColour;
        this.flyingHeight = flyingHeight;

    }

    public void move(){
        System.out.println("A bird can fly");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "additionalColour='" + additionalColour + '\'' +
                ", flyingHeight=" + flyingHeight +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", predator=" + predator +
                '}';
    }
}
