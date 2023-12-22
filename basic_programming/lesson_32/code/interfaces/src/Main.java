public class Main {

    public static void main(String[] args) {
        OurClass ourClassObject = new OurClass();

        System.out.println(ourClassObject.getUserID());
        System.out.println(ourClassObject.getAdminId());

        // Статические методы в интерфейсах ( начинач с  JDK 8)
        /*
        Статический метод интерфейса может быть вызван без реализации интерфейса классом.
        Для его вызова используется название интерфейса :
        InterfaceName.staticMethodName
         */
        System.out.println(OurInterface.getUniversalID());
    }

}
