public class BreakContinue {

    // Break  в циклах
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6) {
                break;

            }

            System.out.println(i);
        }
        System.out.println("After for");


        // continue - когда програм ма встречает  continue  происходит переход
        // к началу следующей итерации тела цикла , а остающиеся после continue  команды в текущей
        // итерации пропускаются

        System.out.println("Continue example");

        for (int i = 0; i < 10; i++) {

            if (i < 6) {
                continue;

            }

            System.out.println(i);
        }


        System.out.println("While continue");
        int j = 0;

        while( j < 10){

            if (j == 6) {
             //   j++;
                continue;
            }

            System.out.println(j);

            j++;




        }

    }
}
