public class Main {
    // Ключевое слово super
    /*
    Варианты использования:
    1. для доступа к полям родительского класса в случае если у родительского и дочернего классов есть поля с одинаковым
        именем
        super.variableName
     2. Вызов в явном виде конструктора родительского класса
     super()

     3. Для доступа к методу родительского класса в случае если он переопределен
     в дочернем
     */
    public static void main(String[] args) {
        SubClass object = new SubClass();
       // object.printI();
        SubClass object2 = new SubClass(19);
        object2.printI();
        object.display();
    }
}
