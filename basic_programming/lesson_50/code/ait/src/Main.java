import ait.controllers.UserController;
import ait.controllers.UserControllerConsoleImpl;
import ait.repositories.UserRepository;
import ait.repositories.UserRepositoryListImpl;
import ait.services.UserService;
import ait.services.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepositoryListImpl();
        UserService service = new UserServiceImpl(repository);
        UserController controller = new UserControllerConsoleImpl(service);

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter: 1 -create new user," +
                    "2 -print all users " +
                    "3 - getById" +
                    "4 - getByEmail" +
                    "5 - delete" +
                    "6 - update" +
                    " exit to finish");
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "exit":
                    exit = true;
                    break;
                case "1":
                    controller.create();
                    break;
                case "2":
                    controller.printAll();
                    break;
                case "3":
                    System.out.println(controller.getById());
                    break;
                case "4":
                    System.out.println(controller.getByEmail());
                    break;
                case "5":
                    controller.delete();
                    break;
                case "6":
                    controller.update();
            }
        }
    }
}
