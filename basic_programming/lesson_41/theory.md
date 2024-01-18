***Set***  

The Set interface extends the Collection interface and represents a collection of unique elements. Set does not introduce any new methods but makes modifications to the inherited ones. In particular, the add() method adds an element to the collection and returns true if the element wasn't already present in the collection.

The generic class HashSet represents a hash table. It inherits its functionality from the AbstractSet class and also implements the Set interface.

A hash table represents a data structure in which all objects have a unique key or hash code. This key allows for the unique identification of an object in the table.

To create a HashSet object, you can use one of the following constructors:  

HashSet(): Creates an empty set.  
HashSet(Collection<? extends E> col): Creates a hash table and adds all elements from the collection col to it.    
HashSet(int capacity): The capacity parameter specifies the initial capacity of the table, which is by default set to 16.  
HashSet(int capacity, float loadFactor): The loadFactor parameter, with a value between 0.0 and 1.0, indicates how full the capacity should be with objects before it is expanded.  
For example, a load factor of 0.75 means that the capacity will be expanded when it is filled to 75%.  
The HashSet class does not introduce any new methods but implements only those that are declared in its parent classes and applicable interfaces.











***Set***

Интерфейс Set расширяет интерфейс Collection и представляет набор уникальных элементов. Set не добавляет новых методов, только вносит изменения в унаследованные. В частности, метод add() добавляет элемент в коллекцию и возвращает true, если в коллекции еще нет такого элемента.

Обобщенный класс HashSet представляет хеш-таблицу. Он наследует свой функционал от класса AbstractSet, а также реализует интерфейс Set.

Хеш-таблица представляет такую структуру данных, в которой все объекты имеют уникальный ключ или хеш-код. Данный ключ позволяет уникально идентифицировать объект в таблице.

Для создания объекта HashSet можно воспользоваться одним из следующих конструкторов:

HashSet(): создает пустой список

HashSet(Collection<? extends E> col): создает хеш-таблицу, в которую добавляет все элементы коллекции col

HashSet(int capacity): параметр capacity указывает начальную емкость таблицы, которая по умолчанию равна 16

HashSet(int capacity, float koef): параметр koef или коэффициент заполнения, значение которого должно быть в пределах от 0.0 до 1.0, указывает, насколько должна быть заполнена емкость объектами прежде чем произойдет ее расширение. Например, коэффициент 0.75 указывает, что при заполнении емкости на 3/4 произойдет ее расширение.

Класс HashSet не добавляет новых методов, реализуя лишь те, что объявлены в родительских классах и применяемых интерфейсах.