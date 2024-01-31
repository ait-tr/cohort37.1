import java.util.List;

public interface CrudRepository<T> {

    void save( T item);
    T findById( Long id);
    List<T> findAll();
    void deleteById(Long id);
    void update(T item);
}
