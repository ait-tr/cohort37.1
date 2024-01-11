import java.util.Comparator;

public class ComparatorByNameThenId implements Comparator<Employee> {

    public int compare( Employee e1, Employee e2){
        int result = e1.getFirstName().compareTo(e2.getFirstName());
        if(result == 0) {
            result = Integer.compare(e1.getId(), e2.getId());
        }
        return result;
        }
    }

