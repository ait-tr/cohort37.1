import java.util.List;

public class Person {
    private String name;
    private List<BankAccount2> bankAccounts;

    public Person(String name, List<BankAccount2> bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public List<BankAccount2> getBankAccounts() {
        return bankAccounts;
    }
}
