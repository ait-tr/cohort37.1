public class Truck {

    private String model;
    private String manufacturer;
    private int year;
    private String color;
    private int maxWeight;
    private int currentWeight = 0;
    private int currentFuel = 0;
    private int maxFuel;
    private String owner;

    public Truck(String model,
                 String manufacturer,
                 int year,
                 String color,
                 int maxWeight,
                 int maxFuel,
                 String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

    public void load(int weight) {

        System.out.println("Loading " + weight + " tons");

    }

    public void unload(int unloadingWeight) {

    }

    public void move() {
    }

    public void stop() {
    }

    public void fillFuel(int currentFuel) {
    }

    public String getOwner() {
        return "The owner is" + owner;
    }

    private void printRemainingCapacity() {
    } //  печатает сколько остается еще груза на борту

    public String toString() {

        return "";
    }
}