import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] ints = {34,21,0,18,1};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        String[] names = {"John","Ann","Ben"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Player player1 = new Player(3,"Jack",22);
        Player player2 = new Player(1,"Simon",19);
        Player player3 = new Player(2,"Alex",24);
        Player player4 = new Player(2,"Jack",12);

        Player[] team = {player1,player2,player3,player4};
        System.out.println("Before sorting:");
        for(Player player: team)
            System.out.println(player);

        System.out.println();
        System.out.println("After sorting:");
        Arrays.sort(team);
        for(Player player: team)
            System.out.println(player);

      //  System.out.println(player1.compareTo(player2));



        // Интерфейс Comparable
        /*
         Используется для сравнения однотипных обьектов и позволяет сортировать обьекты в соотвествии
          с определенным порядком. Для этого нужно переопределить единственный метод интерфейса,
          который называется int compareTo(Object o1)
          Метод сравнивает обьект, на котором он вызывается со вторым обьектом. Результатом его работы будет
          целое число, которое:
          - больше нуля если первый обьект больше второго
          - меньше нуля если меньше
          - равно нулю если обьекты равны

          Сравнение происходит по отдельным полям. Нужно принять решение какое поле класса будет участвовать
          в опредении порядка сортировки. Такой порядок называется естественным порядком сортировки
         */

    }
}
