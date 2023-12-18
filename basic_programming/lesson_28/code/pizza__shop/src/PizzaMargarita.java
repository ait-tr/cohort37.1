public class PizzaMargarita extends Pizza{

    private static String TYPE = "Pizza Margarita";

    public PizzaMargarita(){
        super(TYPE);
    }

    public void prepare(){
        System.out.println("Preparing pizza with mozarella cheese and tomatoes");
    }
}
