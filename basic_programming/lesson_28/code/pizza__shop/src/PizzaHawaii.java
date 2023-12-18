public class PizzaHawaii extends Pizza{
    private static String TYPE  = "Pizza Hawaii";

    public PizzaHawaii(){
        super(TYPE);
    }

    public void prepare(){
        System.out.println("Preparing pizza with pineapple and cheese");
    }
}
