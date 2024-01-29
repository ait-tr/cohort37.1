import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask {

    /*
    Пусть есть класс BankAccount c  полем String IBAN  и  String owner . Написать метод, который принимает
    лист BankAccount ,  и печатает лист IBAN со звездочками после 3 символа
    DE4***********
    DE2***********
     */
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("DE76549089761234","Person1");
        BankAccount account2 = new BankAccount("DE86549089761234","Person2");
        BankAccount account3 = new BankAccount("DE96549089761234","Person3");
        BankAccount account4 = new BankAccount("DE06549089761234","Person4");
        BankAccount account5 = new BankAccount("DE26549089761234","Person5");
        List<BankAccount> accounts = Arrays.asList(account1,account2,account3,account4,account5);

        getListIBANWithStars(accounts);


        BankAccount2 acc1 = new BankAccount2("DE76549089761234");
        BankAccount2 acc2 = new BankAccount2("DE86549089761234");
        BankAccount2 acc3 = new BankAccount2("DE96549089761234");
        BankAccount2 acc4 = new BankAccount2("DE06549089761234");
        BankAccount2 acc5 = new BankAccount2("DE26549089761234");

        List<BankAccount2>ba1 = Arrays.asList(acc1,acc2);
        List<BankAccount2>ba2 = Arrays.asList(acc3,acc4);
        List<BankAccount2>ba3 = Arrays.asList(acc5);

        Person person1 = new Person("Person1",ba1);
        Person person2 = new Person("Person2",ba2);
        Person person3 = new Person("Person3",ba3);

        List<Person> persons = Arrays.asList(person1,person2,person3);

        System.out.println(getListIBANFlatMap(persons));

    }

    public static void getListIBANWithStars(List<BankAccount> accounts){
        accounts.stream()
                .map(a -> replaceWithStarsStream(a.getIBAN()))
                .forEach(System.out :: println);

    }

    private static String replaceWithStars( String str){
        char[] chars = str.toCharArray();
        for( int i = 3; i < str.length(); i++)
            chars[i] = '*';
        return new String(chars);
    }

    private static String replaceWithStarsStream( String str){
        return Stream.of(str.split("")).skip(3).map(c -> "*")
                .collect(Collectors.joining("", str.substring(0,3),""));
    }

    public static List<String> getListIBANWithStarsReturn(List<BankAccount> accounts){
        return accounts.stream()
                .map(a ->{
                    char[] chars = a.getIBAN().toCharArray();
                    for( int i = 3; i < chars.length; i++)
                        chars[i] = '*';
                    return new String(chars);

                } )
                .collect(Collectors.toList());
    }

    /* Пусть есть класс BankAccount c полем String IBAN  и класс Person c полями name  и List<BankAccount>
     Написать метод, который вернет лист IBANs с номерами , замененными звездочками после 3 символа
     */

    public static List<String> getListIBANFlatMap( List<Person> persons){
        return persons
                .stream()
                .flatMap(p -> p.getBankAccounts().stream())
                .map(BankAccount2::getIBAN)
                .map(StreamTask::replaceWithStarsStream)
                .collect(Collectors.toList());
    }
}
