import java.util.Arrays;
import java.util.List;

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
    }

    public static void getListIBANWithStars(List<BankAccount> accounts){
        accounts.stream()
                .map(a -> replaceWithStars(a.getIBAN()))
                .forEach(System.out :: println);

    }

    private static String replaceWithStars( String str){
        char[] chars = str.toCharArray();
        for( int i = 3; i < str.length(); i++)
            chars[i] = '*';
        return new String(chars);
    }
}
