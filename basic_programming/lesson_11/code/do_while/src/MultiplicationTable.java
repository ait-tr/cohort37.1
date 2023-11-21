public class MultiplicationTable {
 // Вложенные циклы

    public static void main(String[] args) {
        printTable();
    }

    static void printTable(){

        int i = 1;
        while (i <= 10)
        {

            int j = 1;
            while (j <= 10){
                System.out.println(i +"*" + j + " = " + j*i);//2*10 = 20
                j++;//11
            }
            System.out.println("***********************");
            i++;//11

        }
    }
}
