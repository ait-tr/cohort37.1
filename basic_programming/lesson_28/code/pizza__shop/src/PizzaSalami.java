public class PizzaSalami extends Pizza{
    private static final String TYPE = "Pizza Salami";

 //   public void method(){
 //       TYPE = "Pizza Diabolo";
 //   }
    public PizzaSalami(){
        super(TYPE);
    }

    protected void prepare(){
        System.out.println("Preparing pizza with salami, cheese,tomatoes");
    }

}
