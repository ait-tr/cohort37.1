import java.util.Comparator;

public class YearComparator implements Comparator<Author> {

    public int compare( Author a1, Author a2){
        return Integer.compare(a1.getYear(),a2.getYear());
    }
}
