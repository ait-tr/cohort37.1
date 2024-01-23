import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
    есть файл такого вида :
    John, Smith, Notebook, 500
    Peter, Black, Mac,800
    John, Smith, Keyboard,25
     Peter, Black, Mouse ,100


    нужно написать метод, который принимает этот файл и записывает информацию в другой
    файл в таком виде:
    John Smith 525
    Peter Black  900

     */
    public static void main(String[] args) {
        String inFile = "input.csv";
        String outFile ="output.csv";

        writeToFileModified(inFile,outFile);

        /*
        Создать интерфейс  Transformable c методом modify,  который принимает
        строку и возвращает строку
        и интерфейс Checkable  c  методом check , который принимает строку и возвращает boolean
        Написать лямбды, реализующие метод соответствующего интерфейса таким образом, что:
        1. при длине строки 3 возвращается true  иначе false
        2.  строка возвращается в верхнем регистре
         */

        //Transformable transformable =
       // Checkable checkable =
    }



    public static void writeToFileModified(String inFile, String outFile){
        try(BufferedReader br = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile,false)))
        {
            String line;
            Map<String,Integer> result = new HashMap<>();

            while ((line = br.readLine()) != null){
                String[] entry = line.split(",");
                String key = entry[0].trim().concat(" ").concat(entry[1].trim());
                int price = Integer.parseInt(entry[3].trim());
                int currentValue = result.getOrDefault(key,0);
                int newValue = currentValue + price;
                result.put(key,newValue);
            }

            for(Map.Entry<String,Integer> me : result.entrySet()){
                bw.write(me.getKey() +' ' + me.getValue());
                bw.newLine();
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
