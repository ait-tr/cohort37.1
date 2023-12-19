public class Main {

    /*
    С использованием агрегации (HAS-A relationship) создать классы Кошелек ( Wallet ) и Деньги ( Money).
Вывести на печать несколько обьектов класса Wallet
     */

    public static void main(String[] args) {

        Money money = new Money("Euro", 100);

        Wallet wallet = new Wallet("leather","big", money);

        System.out.println(wallet);



    }
}
