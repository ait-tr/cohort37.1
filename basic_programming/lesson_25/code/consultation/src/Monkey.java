public class Monkey extends Animal {

    int jumpAbility; //  по 10 бальной шкале
    int tailLength;

    public Monkey(String art, int age, String colour, boolean predator,int jumpAbility, int tailLength){
        super(art,age,colour,predator);
        this.jumpAbility = jumpAbility;
        this.tailLength = tailLength;
    }

    public void move(){
        System.out.println("Monkey jumps in the trees");
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "jumpAbility=" + jumpAbility +
                ", tailLength=" + tailLength +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", predator=" + predator +
                '}';
    }
}
