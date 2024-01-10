import java.util.Comparator;

public class ComparatorByName implements Comparator<Animal> {

    public int compare(Animal an1, Animal an2){
        return an1.getName().compareTo(an2.getName());
    }
}
