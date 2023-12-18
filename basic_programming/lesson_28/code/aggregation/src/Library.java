public class Library {

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooksOfLibrary(){

        return books;
    }
}
