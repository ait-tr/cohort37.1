import ait.model.User;
import ait.repositories.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{
    private static final String MSG_BLANK_ARG_ERROR = "The name and/or email should not be blank";
    private static final String MSG_EMAIL_NOT_CORRECT_ERROR = " Incorrect email format";
    private static final String MSG_EMAIL_ALREADY_EXISTS_ERROR = "The user with this email already exists";

    private static final String MSG_USER_NOT_EXIST_ERROR = "The user does not exist";

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public void createUser(String name, String email) {
    try {
        checkUserParameters(name, email);
        repository.save(new User(name, email));
    } catch(Exception e){
        String message = String.format("Error creating user: name:%s email:%s%n%s%n",name,email,e.getMessage());
        throw new RuntimeException(message);
    }

    }

    private void checkUserParameters(String name, String email){
        if (name == null || email == null || name.isBlank() || email.isBlank()){
            throw new IllegalArgumentException(MSG_BLANK_ARG_ERROR);
        }

        if(email.indexOf('@') < 0){
            throw new IllegalArgumentException(MSG_EMAIL_NOT_CORRECT_ERROR);
        }

        if(repository.findByEmail(email) != null){
            throw new IllegalArgumentException(MSG_EMAIL_ALREADY_EXISTS_ERROR);
        }

    }

    @Override
    public User getById(long id) {

      User foundUser =  repository.findById(id);
      if(foundUser == null) {
          throw new IllegalArgumentException(MSG_USER_NOT_EXIST_ERROR);
      }
      else
          return foundUser;
    }

    @Override
    public User getByEmail(String email) {
        User foundUser = repository.findByEmail(email);
        if(foundUser == null)
            throw new IllegalArgumentException(MSG_USER_NOT_EXIST_ERROR);
        else return foundUser;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public void updateUser(User user) {
        try {
            checkUserParameters(user.getName(), user.getEmail());
            repository.update(user);
        } catch (Exception e){
            String message = String.format("Error creating user: name:%s email:%s%n%s%n",
                    user.getName(),user.getEmail(),e.getMessage());
            throw new RuntimeException(message);
        }
    }

    @Override
    public void deleteById(long id) {
            repository.deleteById(id);
    }
}
