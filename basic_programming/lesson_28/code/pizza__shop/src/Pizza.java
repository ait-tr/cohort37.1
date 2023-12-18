import org.w3c.dom.ls.LSOutput;

public class Pizza {

    private  String type;

    public Pizza( String type ){
        this.type = type;
    }

    public void orderPizza(){
        prepare();
        bake();
        pack();
    }

    protected void prepare(){

    }

    private void bake(){
        System.out.println("Baking " + type);
    }

    private void pack() {
        System.out.println("Packing " + type);
    }
}
