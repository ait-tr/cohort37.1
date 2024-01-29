public class BankAccount {
  private   String IBAN;
  private   String owner;

    public BankAccount(String IBAN, String owner) {
        this.IBAN = IBAN;
        this.owner = owner;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getOwner() {
        return owner;
    }
}
