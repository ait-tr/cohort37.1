import java.io.*;

public class Main1 {
    // ввод- вывод текстовой информации
    /*
    Reader, Writer -  абстрактные классы, находящиеся в основе классов работающих с вводом-выводом символьной информации

   Reader  отвечает за чтение
   int read() -  возвращает текущий символ потока и -1 если символов нет
   int read(char[] buffer)
   int read(char[] buffer, int index, int num)

   Writer - работает на вывод
    void write(int ch)
    void write( char[] chars)

    FileWriter -  запись в файл
    FileWriter(String fileName)
    FileWriter(String fileName, boolean append)
    FileWriter(File fileName)
    FileWriter(File fileName, boolean append)
     */
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("output.txt",true))
        {
            String word = "Hello Java !";
            writer.write(word);
            writer.append('\n');
            writer.append('!');

            writer.flush();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


        /*
        класс FileReader -  чтение текстовых файлов
        FileReader( String fileName)
        FileReader( File fileName)
         */
        try( FileReader reader = new FileReader("output.txt"))
        {
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        /*
        BufferedReader
        BufferWriter
        - классы, используемые для буферизации символьных потоков

        BufferedWriter
        BufferedWriter(Writer out)

         */
       try( BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter("buffered.txt",true))){
           String sentence = " Hello Java  and everybody else!";
           bufferedWriter.write(sentence);

       }
       catch (IOException exception){
           exception.getMessage();
       }

       //BufferedReader -  чтение текста с буферизацией
        // BufferedReader( Reader in )

        System.out.println("Buffered reader");

       //  метод readLine() -  собственный метод класса  BufferedReader -  позволяет считывать информацию построчно
        try(BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {

            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);

            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
