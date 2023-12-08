import static_keyWord.Main;

import java.util.Arrays;

public class Platforms {

    /*
    Написать метод , находящий минимальное количество платформ, необходимых для приема поездов
    на станции в каждый момент времени. Известно время прибытия и отправления поездов ( расписание)

    arrival[] = { 100, 140, 150, 200, 215, 400}
    departure[] ={110, 300, 220, 230, 315, 600}

    time        arr/dep           platforms
    1:00         Arr                1
    1:10         Dep                0
    1:40         Arr                1
    1:50         Arr                2
    2:00         Arr                3
    2:15         Arr                4
    2:20         Dep                3
    2:30         Dep                2
    3:00         Dep                1
    3:15         Dep                0
    4:00         Arr                1
    6:00         Dep                0


    Алгоритм решения:
    1. Сортируем массивы прибытие и отправление
    2. Сравниваем в цикле текущие элементы массивов и выбираем меньший.
        Если элемент выбран из массива  прибытия - увеличиваем количество платформ.
        Если из отправления - уменьшаем
    3. Необходимо записывать текущее количество платформ в специально созданной для этого переменной.
    4. В конце возвращаем максимальное значение полученное для количества платформ.

            arrival[] = { 100, 140, 150, 200, 215, 400}
            departure[] ={110, 300, 220, 230, 315, 600}
     */
    public static void main(String[] args) {
        Platforms platforms = new Platforms();

       int[] arrival = { 100, 140, 150, 200, 215, 400};
       int  departure[] ={110, 300, 220, 230, 315, 600};
        System.out.println(platforms.findNumberPlatforms(arrival,departure));
    }
    public int findNumberPlatforms( int arr[], int dep[])
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformsCurrent = 0;
        int platformsMax = 0;

        int i = 0, j = 0;

        while (i < arr.length && j < dep.length)
        {
            if( arr[i] < dep[j])
            {
                platformsCurrent++;
                i++;
                if( platformsCurrent > platformsMax)
                    platformsMax = platformsCurrent;

            }
            else
            {
                platformsCurrent--;
                j++;
            }

        }
        return platformsMax;

    }
}
