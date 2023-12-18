public class PizzaChoice {

    public Pizza choosePizza(String type) {

        switch (type) {

            case "1":
                return new PizzaSalami();
            case "2":
                return new PizzaMargarita();
            case "3":
                return new PizzaHawaii();

            default:
                return null;

        }
    }
}
