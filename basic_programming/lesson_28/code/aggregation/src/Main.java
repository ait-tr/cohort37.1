public class Main {

    //  Агрегация ( Aggregation)
    /*
    HAS-A   -  a Library has a book
     */
    public static void main(String[] args) {

        Address address = new Address("Street1",12,"Berlin");

        Student john = new Student("John",123456,address);

        System.out.println(john);

        Address teacherAddress = new Address("Street2",23,"Berlin");

        Teacher kate = new Teacher("Kate",123987,teacherAddress);
        System.out.println(kate);



        School school = new School("AIT-TR", new Address("LinkStraße",2,"Berlin"));

        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book ("The Lord of the Rings","J.R.R. Tolkien");

        Book[] books = {book1, book2};
        Library library = new Library(books);

        Book[] bookLibrary = library.getBooksOfLibrary();

        for( Book b : bookLibrary ){
            System.out.println("Title is " + b.title +" and author is "+ b.author);
        }

    }
}
