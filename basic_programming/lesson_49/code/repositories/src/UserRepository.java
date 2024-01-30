import ait.model.User;

public interface UserRepository extends CrudRepository<User>{
    public User findByEmail( String email);
}
