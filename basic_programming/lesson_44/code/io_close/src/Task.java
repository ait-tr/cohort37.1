import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
    /*
    Пусть есть текстовый файл такого вида
    Peter,37
    Simon, 5
    John, 90
    Нужно написать метод, читающий этот файл и возвращающий лист людей старше 18 лет, отсортированный
    по возрасту. Известно, что файл не пустой
    List<Person>

     */
    public static void main(String[] args) {
        System.out.println(composeList("people.txt"));
    }
    public static List<Person> composeList(String fileName){
        List<Person> persons = new ArrayList<>();
        List<String>temp = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;

            while ((line = bufferedReader.readLine()) != null){
                temp.add(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        for( String s : temp){
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if( age > 18)
                persons.add( new Person(nameAge[0].trim(),age));
        }
        Collections.sort(persons);
        return persons;
    }
}
