import java.util.Comparator;

public class BookNameComparator implements Comparator<Author> {

    @Override
    public int compare(Author a1, Author a2) {
        return a1.getBookName().compareTo(a2.getBookName());
    }
}
