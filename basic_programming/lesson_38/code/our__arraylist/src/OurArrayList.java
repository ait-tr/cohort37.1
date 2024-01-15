public class OurArrayList<E> implements OurList<E> {

    private Object[] source;

    private static final int INITIAL_CAPACITY = 16;

    private int size;

    public OurArrayList(){
        source = new Object[INITIAL_CAPACITY];
    }

    public int size(){
        return size;
    }

    public void append( E value){
        if(source.length == size){
            enlargeArray();
        }
        source[size] = value;
        size++;
    }

    private void enlargeArray(){
        E[] newSource = (E[]) new Object[source.length *2];
        for( int i = 0; i < source.length; i++){
            newSource[i] =(E) source[i];
        }
        source = newSource;
    }

    public E get( int index){
        if(index >= size || index < 0)
            return null;
        return(E) source[index];
    }

    public void set(E value, int index){
        if(index >= size || index < 0)
            return ;

        source[index] = value;
    }

    public boolean remove( E value){
        for( int i = 0; i < size; i++){
            if(source[i].equals(value)){
                removeById(i);
                return true;
            }
        }
        return false;
    }


    public E removeById( int index){
        if(index >= size || index < 0)
            return null;

        E result = (E) source[index];
        // [6,2,3]
        for( int i = index + 1; i < size; i++){
            source[i - 1] = source[i];
        }
        source[size - 1] = null;
        size--;

        return result;
    }

    public void clear(){
        size = 0;
    }


}
