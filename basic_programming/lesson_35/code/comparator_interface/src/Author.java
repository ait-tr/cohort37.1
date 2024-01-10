//public class Author implements Comparable<Author> {
public class Author  {
    private String authorName;
    private String bookName;
    private int year;

    public Author( String authorName, String bookName, int year){
        this.authorName = authorName;
        this.bookName = bookName;
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Author author){
        return this.getAuthorName().compareTo(author.getAuthorName());
    }

    public String toString(){
        return getAuthorName() + ":" + getBookName() +"," + getYear();
    }
}
