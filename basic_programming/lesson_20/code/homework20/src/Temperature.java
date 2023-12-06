public class Temperature {
    /*
    Создать класс Temperature (температура), содержащий метод для перевода градусов по фаренгейту
    в градусы цельсия ( celsius = 5*(farenheit - 32)/9). В классе Main создать несколько обьектов
    класса Temperature (значение температуры по фаренгейту должно задаваться через конструктор)
    и вывести результат перевода на экран
     */
    double farenheit;

    public Temperature( double farenheit){
        this.farenheit = farenheit;
    }

    public double farenheitToCelsius(){

      //  double celsius = 5*(farenheit - 32.0)/9.0;

        return 5*(farenheit - 32.0)/9.0;
    }
}
