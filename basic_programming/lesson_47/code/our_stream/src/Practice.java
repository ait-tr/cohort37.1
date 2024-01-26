public class Practice {

    /*
    написать метод, проверяющий является ли строка числом
    "123456" -> true
    "ab123" -> false
    Character.isDigit()  allMatch()
     */
    public static void main(String[] args) {
        System.out.println(isStringDigit("123457"));
        System.out.println(isStringDigit("a123457"));
    }

    public static boolean isStringDigit(String str){
        return str.chars().allMatch(Character :: isDigit);
    }


}
