import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("36")+1);

        System.out.println(findSum("text.txt"));

        File file = new File("longestStr.txt");
        System.out.println(findLongest(file));
    }

    /*
    Task 1
1.Пусть есть текстовый файл такого вида:
1
2
3
4
5
Нужно написать метод, принимающий файл и возвращающий сумму всех значений
     */

    public static int findSum(String fileName){
        int sum = 0;
        String intString;
        try(BufferedReader br = new BufferedReader( new FileReader(fileName))){

            while ((intString = br.readLine()) != null){
                sum = sum + Integer.parseInt(intString);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return sum;
    }

    /*
    Task 2
Написать метод, принимающий текстовый файл, состоящий из нескольких
строчек разной длины и возвращающий самую длинную строчку.
Пример
файл:
aaa
bbbbbbbbbb
cc
вернет метод: bbbbbbbbbb
     */

    public static String findLongest(File fileName){
        String longest = "";

        try( BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;

            while((line = br.readLine()) != null){
                if(line.length() > longest.length())
                    longest = line;
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return longest;
    }
}
