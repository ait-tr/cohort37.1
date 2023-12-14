public class SubClass extends ParentClass {

    int i = 5; //  таже переменная что и в родительском классе

    public SubClass(){
        super("HELLO");
        System.out.println("Constructor of the Child Class executes");
    }

    public SubClass(int i){
        super("HELLO2");
        this.i = i;
    }

   public void printI(){
       System.out.println(i);
   }

   public void printSmth(){
       System.out.println("Child class method");
   }

   public void display(){
        printSmth(); // вызывает метод переопределяющий
        super.printSmth(); // вызывает метод переопределенный (родительского класса)
   }
}
