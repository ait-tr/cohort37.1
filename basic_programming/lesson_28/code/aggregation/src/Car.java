public class Car {

    Engine engine;

    //  агрегация
  //  public Car(Engine engine){
  //      this.engine = engine;
  //  }

    public Car(){
        engine = new Engine();
    }

}
