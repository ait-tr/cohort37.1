import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
    IO Streams   Ввод-вывод
    потоки ввода- вывода

    Абстрактное понятие "поток" в данном случае является ключевым.
    Обьект, из которого считываются данные - является потоком ввода.
    Обьект, в который записываются данные - поток вывода

    Все классы, работающие с вводом-выводом можно разделить на две большие группы:
    работающие с байтами и работающие с символами

    В основе всех классов, работающих с байтами находятся два абстрактных класса -
    InputStream и OutputStream
    В основе классов, работающих с символами тоже два абстрактных класса - Reader, Writer

    Потоки байтов

    InputStream -  базовый класс для всех классов, работающих с потоками ввода

    Основные методы:

    int read() - возвращает текущий байт из потока ( целочисленное представление).
    Когда байтов в потоке не остается, метод вернет -1

    int read( byte[] buffer) -  считывает байты из потока в буферный массив. Возвращает число прочитанных
                                байтов. Если ничего не прочитано, то вернет -1

     int read(byte[]buffer, int index, number)
                buffer - массив байтов, в которые записываются считанные байты
                index - индекс этого массива, начиная с которого записываются байты
                number -  количество байтов, которые необходимо считать

     available() -  возвращает количество доступных для чтения байтов
     close() - закрывает поток

     OutPutStream -  базовый класс для всех классов, работающих с потоками на запись

     void close()
     void flush() - сбрасывает содержимое буфера вывода
                в поток

      void write( int b) -  записывает в поток 1 байт
      void write(byte[] buffer) - записывает в выходной поток массив buffer
      void write(byte[]buffer, int index, number)

      FileOutputStream -  используется для записи байтов в файл. Дочерний класс по отношению к OutputStream
      FileOutputStream(String fileName)
      FileOutputStream(File file)
      FileOutputStream( String fileName, boolean append)
      FileOutputStream( File fileName, boolean append)
      если append = true, данные добавляются в конец файла
      false -  файл полностью перезаписывается
     */
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println(file.exists());

        String  string = "Hello Java";

       try (FileOutputStream fos = new FileOutputStream(file)){
           byte[] buffer = string.getBytes();
           fos.write(buffer,0,buffer.length);
       }catch (IOException e){
           System.out.println(e.getMessage());
       }

       // FileInputStream - чтение файлов

       try(FileInputStream fis = new FileInputStream(file))
       {
           int i;
           while((i = fis.read()) != -1){
               System.out.print((char )i);
           }

       }catch (IOException e){
           System.out.println(e.getMessage());
       }

       // чтение в буферный массив
        System.out.println("reading in buffer array");

       try(FileInputStream fin = new FileInputStream(file)) {
           byte[] buffer = new byte[512];

           int counter;
           while((counter = fin.read(buffer)) != -1){
               for( int i = 0; i < counter; i++){
                   System.out.println((char)buffer[i]);
               }
           }

       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }

    }



}
