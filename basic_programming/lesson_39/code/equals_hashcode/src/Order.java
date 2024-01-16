import java.util.Objects;

public class Order {

    private int id;
    private String name;

    public Order( int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }


    public boolean equals( Object o){
        if( this == o)
            return true;
        if(!(o instanceof Order))
            return false;

        Order order = (Order)o;

        return id == order.id && name.equals(order.name);
        }

     /*   public int hashCode(){
            return id * name.hashCode();
        }
        */

    public int hashCode(){
        return Objects.hash(id,name);
    }

    @Override
   /* public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        return Objects.equals(name, order.name);
    }
    */




    public String toString(){
        return id + " : " + name;
    }
}
