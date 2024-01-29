***Working with Dates and Times***

The `LocalDate` class from the `java.time` package is designed for working with dates. The functionality of this class allows you to create dates and modify them by adding or subtracting the necessary number of days, months, or years.

Key methods of `LocalDate`:

- `static LocalDate now()`: returns an object representing the current date.
- `static LocalDate of(int year, int month, int day)`: returns an object representing a date with a specified year, month, and day.
- `int getYear()`: returns the year of the date.
- `int getMonthValue()`: returns the month.
- `int getDayOfMonth()`: returns the day of the month (value ranging from 1 to 31).
- `int getDayOfYear()`: returns the day of the year (value ranging from 1 to 365).
- `DayOfWeek getDayOfWeek()`: returns the day of the week as a `DayOfWeek` enumeration value.
- `LocalDate plusDays(int n)`: adds a certain number of days to the date.
- `LocalDate plusWeeks(int n)`: adds a certain number of weeks to the date.
- `LocalDate plusMonths(int n)`: adds a certain number of months to the date.
- `LocalDate plusYears(int n)`: adds a certain number of years to the date.
- `LocalDate minusDays(int n)`: subtracts a certain number of days from the date.
- `LocalDate minusMonths(int n)`: subtracts a certain number of months from the date.
- `LocalDate minusWeeks(int n)`: subtracts a certain number of weeks from the date.
- `LocalDate minusYears(int n)`: subtracts a certain number of years from the date.




***Работа с датами и временем***

Класс LocalDate из пакета java.time предназначен для работы с датами. Функционал этого класса позволяет создавать даты и изменять их, добавляя и отнимая необходимое количество дней/месяцев/лет.

Основные методы LocalDate:

static LocalDate now(): возвращает объект, который представляет текущую дату

static LocalDate of(int year, int month, int day): возвращает объект, который представляет дату с определенными годом, месяцем и днем

int getYear(): возвращает год даты

int getMonthValue(): возвращает месяц

int getDayOfMonth(): возвращает день месяца (значение от 1 до 31)

int getDayOfYear(): возвращает номер дня года (значение от 1 до 365)

DayOfWeek getDayOfWeek(): возвращает день недели в виде значения перечисления DayOfWeek

LocalDate plusDays(int n): добавляет к дате некоторое количество дней

LocalDate plusWeeks(int n): добавляет к дате некоторое количество недель

LocalDate plusMonths(int n): добавляет к дате некоторое количество месяцев

LocalDate plusYears(int n): добавляет к дате некоторое количество лет

LocalDate minusDays(int n): отнимает от даты некоторое количество дней

LocalDate minusMonths(int n): отнимает от даты некоторое количество месяцев

LocalDate minusWeeks(int n): отнимает от даты некоторое количество недель

LocalDate minusYears(int n): отнимает от даты некоторое количество лет  



***Asymptotic Analysis*** ( перевод см.ниже)

When we talk about measuring the complexity of algorithms, we imply analyzing the time required to process a very large set of data. This kind of analysis is called asymptotic. How much time will it take to process an array of ten elements? Thousands? Ten million? If an algorithm processes a thousand elements in five milliseconds, what will happen if we feed it a million? Will it run for five minutes or five years? Isn't it better to clarify this before the client?

The devil is in the details!

Order of Growth

The order of growth describes how the complexity of an algorithm increases as the size of the input data grows. It's most often represented using Big O notation (from German "Ordnung" - order): O(f(x)), where f(x) is a formula expressing the algorithm's complexity. The formula may contain the variable n, representing the size of the input data. Below is a list of the most commonly encountered orders of growth, but it's by no means exhaustive.

Constant - O(1)
An O(1) growth order means that the computational complexity of the algorithm doesn't depend on the size of the input data. It's important to note, however, that the one in the formula doesn't necessarily mean the algorithm executes in just one operation or requires very little time. It could take a microsecond or a year. What's significant is that this time doesn't depend on the input data.

Linear - O(n)
An O(n) growth order means that the algorithm's complexity grows linearly with the increase in the input array's size. If a linear algorithm processes one element in five milliseconds, we can expect it to process a thousand elements in five seconds.

Such algorithms are easy to identify by the presence of a loop for each element in the input array.

Logarithmic - O(log n)
An O(log n) growth order means that the algorithm's execution time grows logarithmically with the increase in the input array's size.

Quadratic - O(n^2)
The runtime of an algorithm with an O(n^2) growth order depends on the square of the input array's size. Even though this situation is sometimes unavoidable, quadratic complexity is a reason to reconsider the algorithms or data structures being used.




***Асимптотический анализ***  
Когда мы говорим об измерении сложности алгоритмов, мы подразумеваем анализ времени, которое потребуется для обработки очень большого набора данных. Такой анализ называют асимптотическим. Сколько времени потребуется на обработку массива из десяти элементов? Тысячи? Десяти миллионов? Если алгоритм обрабатывает тысячу элементов за пять миллисекунд, что случится, если мы передадим в него миллион? Будет ли он выполняться пять минут или пять лет? Не стоит ли выяснить это раньше заказчика?

Все решают мелочи!

**Порядок роста**  
Порядок роста описывает то, как сложность алгоритма растет с увеличением размера входных данных. Чаще всего он представлен в виде O-нотации (от нем. «Ordnung» — порядок): O(f(x)), где f(x) — формула, выражающая сложность алгоритма. В формуле может присутствовать переменная n, представляющая размер входных данных. Ниже приводится список наиболее часто встречающихся порядков роста, но он ни в коем случае не полный.

Константный — O(1)  
Порядок роста O(1) означает, что вычислительная сложность алгоритма не зависит от размера входных данных. Следует помнить, однако, что единица в формуле не значит, что алгоритм выполняется за одну операцию или требует очень мало времени. Он может потребовать и микросекунду, и год. Важно то, что это время не зависит от входных данных.

Линейный — O(n)  
Порядок роста O(n) означает, что сложность алгоритма линейно растет с увеличением входного массива. Если линейный алгоритм обрабатывает один элемент пять миллисекунд, то мы можем ожидать, что тысячу элементов он обработает за пять секунд.

Такие алгоритмы легко узнать по наличию цикла по каждому элементу входного массива.    
Логарифмический — O(log n)  
Порядок роста O(log n) означает, что время выполнения алгоритма растет логарифмически с увеличением размера входного массива.

Квадратичный — O(n^2)  
Время работы алгоритма с порядком роста O(n^2) зависит от квадрата размера входного массива. Несмотря на то, что такой ситуации иногда не избежать, квадратичная сложность — повод пересмотреть используемые алгоритмы или структуры данных.


