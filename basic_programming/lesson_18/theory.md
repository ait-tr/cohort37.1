***Object-Oriented Programming***
**Classes and Objects**

Java is an object-oriented language, so concepts like "class" and "object" play a crucial role in it. Any Java program can be seen as a collection of interacting objects.

The template or description of an object is a class, and an object represents an instance of that class. Another analogy can be drawn. We all have some idea of a person—having two hands, two legs, a head, a torso, etc. This conceptual idea can be called a class. An actually existing person (effectively an instance of this class) is an object of this class.

A class is defined using the keyword `class`.

**Constructors**
In addition to regular methods, classes can define special methods called constructors. Constructors are called when creating a new object of that class. Constructors perform the initialization of the object.

If a class does not define any constructor, a default parameterless constructor is automatically created for that class.

If a constructor does not initialize the values of object variables, they are given default values. For numeric types, this is 0, and for string type and classes, it is `null` (essentially the absence of a value).

If it is necessary for some logic to be executed when an object is created, for example, to have class fields receive specific values, custom constructors can be defined in the class.




***Объектно-ориентированное программирование***  
**Классы и объекты**  

Java является объектно-ориентированным языком, поэтому такие понятия как "класс" и "объект" играют в нем ключевую роль. Любую программу на Java можно представить как набор взаимодействующих между собой объектов.

Шаблоном или описанием объекта является класс, а объект представляет экземпляр этого класса. Можно еще провести следующую аналогию. У нас у всех есть некоторое представление о человеке - наличие двух рук, двух ног, головы, туловища и т.д. Есть некоторый шаблон - этот шаблон можно назвать классом. Реально же существующий человек (фактически экземпляр данного класса) является объектом этого класса.

Класс определяется с помощью ключевого слова сlass.      


**Конструкторы**  
Кроме обычных методов классы могут определять специальные методы, которые называются конструкторами. Конструкторы вызываются при создании нового объекта данного класса. Конструкторы выполняют инициализацию объекта.

Если в классе не определено ни одного конструктора, то для этого класса автоматически создается конструктор без параметров.

Если конструктор не инициализирует значения переменных объекта, то они получают значения по умолчанию. Для переменных числовых типов это число 0, а для типа string и классов - это значение null (то есть фактически отсутствие значения).  
Если необходимо, чтобы при создании объекта производилась какая-то логика, например, чтобы поля класса получали какие-то определенные значения, то можно определить в классе свои конструкторы.
