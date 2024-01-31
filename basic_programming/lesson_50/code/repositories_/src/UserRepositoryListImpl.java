import ait.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryListImpl implements UserRepository{

    private Long currentID = 1L;
    private final List<User> users = new ArrayList<>();


    @Override
    public void save(User user) {
        users.add(user);
        user.setId(currentID++);

    }

    @Override
    public User findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void deleteById(Long id) {
        User foundUser = findById(id);
        if(foundUser != null)
            users.remove(foundUser);

    }

    @Override
    public void update(User user) {
        User userToUpdate = findById(user.getId());
        if( userToUpdate != null){
            userToUpdate.setName(user.getName());
            userToUpdate.setEmail(user.getEmail());
        }
        else throw new RuntimeException();

    }

    @Override
    public User findByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}
