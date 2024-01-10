import java.util.Arrays;

public class Main {
    /*
    Создать класс Animal c полями name, weight, colour.
    Используя компараторы вывести на экран в классе Main  список животных, упорядоченный по
    следующим параметрам:
    -по имени
    -по весу
    - список названий животных, упорядоченный по возрастанию последней буквы имени
    Wolf
    Bear
    Elephant
    Anakonda
    Fox

    Anakonda
    Wolf
    Bear
    Elephant
    Fox
     */

    public static void main(String[] args) {
        Animal animal1 = new Animal("Wolf",100,"grey");
        Animal animal2 = new Animal("Elephant",1000,"white");
        Animal animal3 = new Animal("Bear",600,"brown");
        Animal animal4 = new Animal("Fox",20,"red");
        Animal animal5 = new Animal("Anakonda",200,"yellow");

        Animal[]animals = {animal1,animal2,animal3,animal4,animal5};

        System.out.println("--------sorting by colour--------");
        Arrays.sort(animals);
            for( Animal animal : animals)
                System.out.println(animal);

        System.out.println("------------By name---------------");
        Arrays.sort(animals, new ComparatorByName());
        for( Animal animal : animals)
            System.out.println(animal);

        System.out.println("----------By weight---------------");
        Arrays.sort(animals, new ComparatorByWeight());
        for( Animal animal : animals)
            System.out.println(animal);


        System.out.println("----------by last letter-----------");
        Arrays.sort(animals, new ComparatorByLastLetter());

        for(Animal animal : animals){
            System.out.println(animal.getName());
        }
    }
}
