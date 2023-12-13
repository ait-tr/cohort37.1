***Object-Oriented Programming***
**Classes and Objects**

Java is an object-oriented language, so concepts like "class" and "object" play a crucial role in it. Any Java program can be seen as a set of interacting objects.

A class serves as the template or description of an object, and an object represents an instance of that class. We can draw an analogy here. We all have some conception of a human - having two arms, two legs, a head, a torso, etc. This conceptual template can be likened to a class. An actually existing person (essentially an instance of this class) is an object of this class.

A class is defined using the keyword `class`.

**Constructors**  
In addition to regular methods, classes can define special methods called constructors. Constructors are called when a new object of the class is created. Constructors perform the initialization of the object.

If a class does not define any constructors, a default constructor without parameters is automatically created for that class.

If a constructor does not initialize the values of object variables, they receive default values. For numeric types, this is 0, and for string type and classes, it is `null` (effectively indicating the absence of a value).  
If it's necessary for some logic to be executed when an object is created, for instance, for class fields to receive specific values, custom constructors can be defined in the class.

***Access Modifiers and Encapsulation***

All members of a class in the Java language - fields and methods - have access modifiers. In previous topics, we encountered the `public` modifier. Access modifiers define the permissible visibility scope for class members, i.e., the context in which a variable or method can be used.

The following access modifiers are used in Java:

- `public`: a public, accessible class, or class member. Fields and methods declared with the `public` modifier are visible to other classes in the current package and external packages.

- `private`: a closed class or class member, the opposite of the `public` modifier. A private class or class member is accessible only from the code within the same class.

- `protected`: such a class or class member is accessible from anywhere in the current class or package or in derived classes, even if they are in other packages.

Default Modifier: The absence of a modifier for a class field or method implies the application of the default modifier. Such fields or methods are visible to all classes in the current package.


***Inheritance***

One of the key aspects of object-oriented programming is inheritance. Through inheritance, you can extend the functionality of existing classes by adding new features or modifying existing ones. To declare one class as a subclass of another, you need to use the "extends" keyword after the name of the subclass, followed by the name of the base class.

If constructors are defined in the base class, it is necessary to call one of the base class constructors in the derived class constructor using the "super" keyword. When calling the constructor after the "super" keyword, a list of arguments is provided in parentheses. The call to the base class constructor must be at the very beginning of the derived class constructor.

The derived class has access to all methods and fields of the base class (even if the base class is in another package) except those defined with the "private" modifier. Additionally, the derived class can also add its own fields and methods.



  
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

***Модификаторы доступа и инкапсуляция***

Все члены класса в языке Java - поля и методы - имеют модификаторы доступа. В прошлых темах мы уже сталкивались с модификатором public. Модификаторы доступа позволяют задать допустимую область видимости для членов класса, то есть контекст, в котором можно употреблять данную переменную или метод.

В Java используются следующие модификаторы доступа:

public: публичный, общедоступный класс или член класса. Поля и методы, объявленные с модификатором public, видны другим классам из текущего пакета и из внешних пакетов.

private: закрытый класс или член класса, противоположность модификатору public. Закрытый класс или член класса доступен только из кода в том же классе.

protected: такой класс или член класса доступен из любого места в текущем классе или пакете или в производных классах, даже если они находятся в других пакетах

Модификатор по умолчанию. Отсутствие модификатора у поля или метода класса предполагает применение к нему модификатора по умолчанию. Такие поля или методы видны всем классам в текущем пакете.






***Наследование***  

Одним из ключевых аспектов объектно-ориентированного программирования является наследование. С помощью наследования можно расширить функционал уже имеющихся классов за счет добавления нового функционала или изменения старого.  
Чтобы объявить один класс наследником от другого, надо использовать после имени класса-наследника ключевое слово extends, после которого идет имя базового класса.  
Если в базовом классе определены конструкторы, то в конструкторе производного классы необходимо вызвать один из конструкторов базового класса с помощью ключевого слова super.  
При вызове конструктора после слова super в скобках идет перечисление передаваемых аргументов. При этом вызов конструктора базового класса должен идти в самом начале в конструкторе производного класса.   
Производный класс имеет доступ ко всем методам и полям базового класса (даже если базовый класс находится в другом пакете) кроме тех, которые определены с модификатором private. При этом производный класс также может добавлять свои поля и методы