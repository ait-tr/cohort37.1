import java.util.Comparator;

public class AuthorNameComparator implements Comparator<Author> {
    @Override
    public int compare(Author a1, Author a2) {
        return a1.getAuthorName().compareTo(a2.getAuthorName());
    }
}
