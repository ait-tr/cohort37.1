***Interfaces***

The mechanism of inheritance is very convenient, but it has its limitations. In particular, we can inherit only from one class, unlike, for example, the C++ language, where multiple inheritance is possible.

In the Java language, interfaces partially address such an issue. Interfaces define functionality without a specific implementation, which is then implemented by classes that apply these interfaces. A single class can implement multiple interfaces.

To define an interface, the keyword 'interface' is used.
An interface can define constants and methods, which may or may not have implementations. Methods without implementations are similar to abstract methods in abstract classes. In this case, one method is declared without an implementation.

All methods in an interface do not have access modifiers, but in practice, they are public by default since the purpose of an interface is to define functionality for implementation by a class. Therefore, all functionality must be open for implementation.

To make a class apply an interface, the keyword 'implements' is used.


***Интерфейсы***

Механизм наследования очень удобен, но он имеет свои ограничения. В частности мы можем наследовать только от одного класса, в отличие, например, от языка С++, где имеется множественное наследование.

В языке Java подобную проблему частично позволяют решить интерфейсы. Интерфейсы определяют некоторый функционал, не имеющий конкретной реализации, который затем реализуют классы, применяющие эти интерфейсы. И один класс может применить множество интерфейсов.

Чтобы определить интерфейс, используется ключевое слово interface.   
Интерфейс может определять константы и методы, которые могут иметь, а могут и не иметь реализации. Методы без реализации похожи на абстрактные методы абстрактных классов. Так, в данном случае объявлен один метод, который не имеет реализации.

Все методы интерфейса не имеют модификаторов доступа, но фактически по умолчанию доступ public, так как цель интерфейса - определение функционала для реализации его классом. Поэтому весь функционал должен быть открыт для реализации.

Чтобы класс применил интерфейс, надо использовать ключевое слово implements.