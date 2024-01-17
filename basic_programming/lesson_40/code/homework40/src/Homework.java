import java.util.List;

public class Homework {
/*
Написать метод, принимающий не пустой лист строк и возвращающий строку, которая встречается раньше в листе -
 самую короткую или самую длинную. Все строки в листе разной длины
 */
 // 5,1,0,8
    String findShortestLongest( List<String> list) {
        String minSizeElement = list.get(0);
        int indexMinElt = 0;

        String maxSizeElement = list.get(0);
        int indexMaxElt = 0;

        for( int i = 0; i < list.size(); i++){
            if( list.get(i).length() < minSizeElement.length()){
                minSizeElement = list.get(i);
                indexMinElt = i;
            }else if ( list.get(i).length() > maxSizeElement.length()){
                maxSizeElement = list.get(i);
                indexMaxElt = i;
            }
        }
        if(indexMinElt < indexMaxElt)
            return minSizeElement;
        return maxSizeElement;
    }
}
