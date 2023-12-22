public interface OurInterface {

    // "нормальный" метод
    int getUserID();

    // дефолтный метод
    default int getAdminId(){
        return 32;
    }

    static int getUniversalID(){
        return 1000;
    }
}
