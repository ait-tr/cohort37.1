import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

public class Homework {

    /*
    Написать метод, принимающий имя файла и лист Person. Метод сохраняет в этот файл обьекты класса Person из листа
    ( класс Person имеет 2 поля name и age- см код занятия).
     */
    public static void main(String[] args) {
        Person person1 = new Person("Peter",40);
        Person person2 = new Person("John",45);
        Person person3 = new Person("Bill",67);

        List<Person>persons = Arrays.asList(person1,person2,person3);
        writePersonToFile("output.txt",persons);
    }

    public static void writePersonToFile( String fileName, List<Person> persons){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out))) {

            for(Person person : persons) {
                bw.write("\"" + person.name + "\"" + "," + person.age);
                bw1.write("\"" + person.name + "\"" + "," + person.age);
                bw.newLine();
                bw1.newLine();
            }

        }catch (IOException e){}
            // in, out, err
    }
}
