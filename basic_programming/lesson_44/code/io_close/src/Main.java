import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    // закрытие ресурса через try-catch-finally

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("longestStr.txt");

            int i;
            while( (i = fileInputStream.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

        // try-with-resources

        System.out.println("\nwith try-with-resources");

        try(FileInputStream fileInputStream1 = new FileInputStream("longestStr.txt")){
            int i;
            while((i = fileInputStream1.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());

        }
    }
}
