import ait.model.User;

import java.util.List;

public interface UserController {

    public void create();

    User getById();
    User getByEmail();

    public List<User> getAll();
    public void printAll();

    public void delete();

    public void update();
}
