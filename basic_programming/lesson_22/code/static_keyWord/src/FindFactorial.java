public class FindFactorial {
    public static void main(String[] args) {
      FindFactorial.Factorial f = FindFactorial.getFactorial(5);

        System.out.println("Factorial of "+f.getNumber() +" = " + f.getResult());
    }

    public static Factorial getFactorial(int number){
        int result = 1;

        for( int i = 1; i <= number; i++){
            result *= i;
        }

        return new Factorial(result, number);
    }

    public static class Factorial{
        private int result;
        private int number;

        public Factorial( int result, int number){
            this.result = result;
            this.number = number;
        }

        public int getResult(){
            return result;
        }

        public int getNumber(){
            return number;
        }

    }
}
