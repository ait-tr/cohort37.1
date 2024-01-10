import java.util.Arrays;

public class Main {
    /*
    Comparator  интерфейс Компаратор

    Предоставляет возможности дополнительной сортировки по критериям, отличающимся от сортировки
    в естественном порядке.
    Находится в пакете java.util  и имеет метод compare()
    public int compare( T o1, T o2)
    Принимает 2 обьекта и сравнивает их по тому же принципу, что и compareTo
     */
    public static void main(String[] args) {

        Author author1 = new Author("Dauthor","Rbook",2020);
        Author author2 = new Author("Kauthor","Bbook",1855);
        Author author3 = new Author("Fauthor","Ybook",2023);
        Author author4 = new Author("Xauthor","Sbook",1971);
        Author author5 = new Author("Aauthor","Tbook",1958);

        Author[] authors = {author1,author2,author3,author4,author5};

        System.out.println("Before sorting");
        for (Author author : authors)
            System.out.println(author);

        System.out.println();


        System.out.println("Sort by author's name:");
        Arrays.sort(authors, new AuthorNameComparator());

        for (Author author : authors)
            System.out.println(author);


        System.out.println();
        System.out.println("Sort by book's name:");

        BookNameComparator bookNameComparator = new BookNameComparator();

        Arrays.sort(authors,new BookNameComparator()); // при передаче в метод sort  в качестве аргумента обьекта
        // компаратора сортировка будет происходить в порядке, определенном методом compare  данного компаратора
        for (Author author : authors)
            System.out.println(author);


        System.out.println();
        System.out.println("sort by year:");

        Arrays.sort(authors, new YearComparator());
        for (Author author : authors)
            System.out.println(author);

    }

}
