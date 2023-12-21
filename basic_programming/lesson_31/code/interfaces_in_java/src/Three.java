public class Three implements Serial{

    int value;

    public Three(){
        value = 0;
    }
    @Override
    public int getNext() {
        return value +3;
    }

    @Override
    public void reset() {
        value = -1;
    }

    @Override
    public void setInit(int a) {
            value = a;
    }
}
