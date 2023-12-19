public class Money {

    String currency;
    int denomination;

    public Money(String currency, int denomination) {
        this.currency = currency;
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", denomination=" + denomination +
                '}';
    }
}
