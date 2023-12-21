public interface OurInterfaceWithDefaultMethods {

    int getUserID();

    default int getAdminID(){
        return 26;
    }
}
