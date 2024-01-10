***Interface Comparable***  

In order for objects to be comparable and sortable, they must implement the Comparable interface. When implementing the interface, it's parameterized by the current class.
The Comparable interface contains a single method: int compareTo(E item), which compares the current object with the object passed as a parameter. If this method returns a negative number, then the current object will come before the one passed through the parameter. If the method returns a positive number, then it will be the opposite, with the second object coming after. If the method returns zero, it means both objects are equal.
  
***Interface Comparator***  
We might encounter a problem if a developer hasn't implemented the Comparable interface in their class that we want to use, or they have implemented it but we're not satisfied with its functionality, and we want to override it. For such cases, there's a more flexible approach involving the use of the Comparator interface.

The Comparator interface contains a set of methods, with the key one being the compare() method.
The compare method also returns a numeric value - if it's negative, object 'a' precedes object 'b'; otherwise, it's the opposite. And if the method returns zero, then the objects are equal. To apply the interface, we first need to create a comparator class that implements this interface.



***Интерфейс Comparable***  

Для того, чтобы объекты  можно было сравнить и сортировать, они должны применять интерфейс Comparable<E>. При применении интерфейса он типизируется текущим классом.   
Интерфейс Comparable содержит один единственный метод int compareTo(E item), который сравнивает текущий объект с объектом, переданным в качестве параметра. Если этот метод возвращает отрицательное число, то текущий объект будет располагаться перед тем, который передается через параметр. Если метод вернет положительное число, то, наоборот, после второго объекта. Если метод возвратит ноль, значит, оба объекта равны.  


***Интерфейс Comparator***  
Перед нами может возникнуть проблема  если разработчик не реализовал в своем классе, который мы хотим использовать, интерфейс Comparable, либо реализовал, но нас не устраивает его функциональность, и мы хотим ее переопределить. На этот случай есть еще более гибкий способ, предполагающий применение интерфейса Comparator<E>.

Интерфейс Comparator содержит ряд методов, ключевым из которых является метод compare().  
Метод compare также возвращает числовое значение - если оно отрицательное, то объект a предшествует объекту b, иначе - наоборот. А если метод возвращает ноль, то объекты равны. Для применения интерфейса нам вначале надо создать класс компаратора, который реализует этот интерфейс.