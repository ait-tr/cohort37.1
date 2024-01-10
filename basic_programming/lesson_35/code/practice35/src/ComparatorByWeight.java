import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Animal> {
    public int compare(Animal an1, Animal an2){
        return an1.getWeight() - an2.getWeight();
    }
}
