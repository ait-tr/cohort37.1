public class Two implements Serial{


    int value;

    public Two(){
        value = 0;
    }


    @Override
    public int getNext() {
        value += 2;
        return value;
    }

    @Override
    public void reset() {
            value = 0;
    }

    @Override
    public void setInit(int a) {
            value = a +1 ;
    }

    public int previous(){
        return value -2;
    }
}
