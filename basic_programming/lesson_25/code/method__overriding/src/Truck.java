public class Truck extends Car {

    @Override
    public void drive(){
        System.out.println("A truck carries a load");
    }
    public void sound(){
        System.out.println("A truck makes a deep beep");
    }


    public void load(){
        System.out.println("Loading");
    }
}
