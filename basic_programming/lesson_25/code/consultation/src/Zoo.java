public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 0,"Colourless", false);
        Monkey monkey =  new Monkey("Monkey",10,"brown",false,9,100);
        Animal lion = new Lion("Lion",25,"gold",true,150);
        Animal bird = new Bird("Crow",5,"black",true,"grey",100);
        Animal snake = new Snake("Anakonda",10,"black-yellow",true, false,10);

        Lion sleepingLion = new Lion("Lion",25,"gold",true,150);
       // sleepingLion.


        Animal[] zoo = {animal,monkey,lion,bird,snake};

        for(Animal beast : zoo){
            System.out.println(beast);
        }

        System.out.println("All the beasts can move the following way :");

        for (Animal beast : zoo){
            beast.move();
        }


    }
}
