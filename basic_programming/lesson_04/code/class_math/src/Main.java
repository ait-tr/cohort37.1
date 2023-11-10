public class Main {

    public static void main(String[] args) {

     int abs1 = Math.abs(10); //  значение по модулю
        System.out.println(abs1);

     int abs2 = Math.abs(-10);
        System.out.println(abs2);

        int a = 1;
        int b = 2;

      int min = Math.min(a,b); // минимальное из двух занчений
        System.out.println(min);

      int max = Math.max(a,b); // максимум
        System.out.println(max);

        // округление
      double roundDown = Math.round(22.306);
      double roundUp = Math.round(22.56);
        System.out.println("roundDown = " + roundDown);
        System.out.println("roundUp = " + roundUp);

        Math.random(); //  генерирует случайное число в диапазоне от 0 до 1
        double rand = Math.random();
        System.out.println(Math.random()*1000 + 100);

        //  возведение в степень
        System.out.println(Math.pow(2,3));

        // извлечение корня
        System.out.println(Math.sqrt(4));

        // число PI = 3.14
        System.out.println(Math.PI);









    }

}
