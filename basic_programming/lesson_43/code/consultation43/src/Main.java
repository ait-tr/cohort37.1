import java.io.*;

public class Main {

    /*
    Написать  метод, читающий текстовый файл и возвращающий его содержимое в виже строки
     */
    public static void main(String[] args) throws IOException{
        String dva = "2";
      //  System.out.println(Integer.parseInt(dva) + 1);

        File file = new File("inpu_t.txt");

     //   System.out.println(readIntoString(file));
        //чтение с клавиатуры с помощью BufferedReader и запись этих данных в файл с помощью BufferedWriter

        try( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fromConsole.txt",true)))
        {
            String line;
            while(!(line = bufferedReader.readLine()).equalsIgnoreCase("EXIT")){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public  static String readIntoString(File fileName)throws IOException {
       // FileReader fileReader = new FileReader(fileName);
        StringBuilder sb = new StringBuilder();
       try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
           String line;

           while((line = bufferedReader.readLine()) != null)
           {
               sb.append(line).append(" ");
             //  sb.append(System.lineSeparator());
           }
       }
       return new String(sb);
    }

    /*

     */
}
