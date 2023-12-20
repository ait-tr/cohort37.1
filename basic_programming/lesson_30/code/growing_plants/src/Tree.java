public class Tree extends Plant{

    private static final int TREE_GROW_PER_SEASON = 5;

    public Tree( String name, int height, int age){
        super(name,height,age);
    }

    public void doSummer(){
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() +" has grown in Summer, the height is " + getHeight());
    }

    public void doAutumn(){
        System.out.println(getName() + " is not growing in Autumn, the height is " + getHeight());
    }

    public int getGrowPerSeason(){
        return TREE_GROW_PER_SEASON;
    }
}
