
**Abstract Classes**

In addition to regular classes, Java has abstract classes. An abstract class is similar to a regular class. In an abstract class, you can define fields and methods, but at the same time, you cannot create an object or instance of an abstract class. Abstract classes are intended to provide basic functionality for their subclasses, and the derived classes implement this functionality.

The keyword "abstract" is used when defining abstract classes. The main distinction is that you cannot use the constructor of an abstract class to create its object. In addition to regular methods, an abstract class can contain abstract methods. These methods are defined using the "abstract" keyword and have no implementation.

A derived class must override and implement all abstract methods present in the base abstract class. Also, it's worth noting that if a class has at least one abstract method, the class itself must be declared as abstract.


***Абстрактные классы***      
Кроме обычных классов в Java есть абстрактные классы. Абстрактный класс похож на обычный класс. В абстрактном классе также можно определить поля и методы, но в то же время нельзя создать объект или экземпляр абстрактного класса. Абстрактные классы призваны предоставлять базовый функционал для классов-наследников. А производные классы уже реализуют этот функционал.

При определении абстрактных классов используется ключевое слово abstract.  
Но главное отличие состоит в том, что мы не можем использовать конструктор абстрактного класса для создания его объекта.  
Кроме обычных методов абстрактный класс может содержать абстрактные методы. Такие методы определяются с помощью ключевого слова abstract и не имеют никакой реализации.  
Производный класс обязан переопределить и реализовать все абстрактные методы, которые имеются в базовом абстрактном классе. Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный.
