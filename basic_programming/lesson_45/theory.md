***Lambda Expressions***

Among the innovations introduced into the Java language with the release of JDK 8, lambda expressions stand out. A lambda represents a set of instructions that can be assigned to a variable and then invoked multiple times in various parts of the program.

The core of a lambda expression is the lambda operator, which is represented by the arrow "->". This operator separates the lambda expression into two parts: the left part contains the list of parameters for the expression, and the right part actually represents the body of the lambda expression, where all the actions are performed.

A lambda expression doesn't execute by itself; instead, it forms an implementation of a method defined in a functional interface. It is important to note that the functional interface should contain only a single method without an implementation.

***Method Reference***  
Starting from JDK 8 in Java, you can pass a reference to another method as a parameter to a method. In principle, this approach is similar to passing lambda expressions as parameters.

A method reference is passed in the form of `class_name::static_method_name` (if the method is static) or `object_class::method_name` (if the method is non-static).

***Built-in Functional Interfaces***  
In JDK 8, along with the functionality of lambda expressions, a number of built-in functional interfaces were also added, which we can use in various situations and in different APIs. In particular, in the Stream API, which is an application interface for working with data, the main interfaces include:

- Predicate<T>
- Consumer<T>
- Function<T, R>
- Supplier<T>
- UnaryOperator<T>
- BinaryOperator<T>



***Лямбда выражения***

Среди новшеств, которые были привнесены в язык Java с выходом JDK 8, особняком стоят лямбда-выражения. Лямбда представляет набор инструкций, которые можно выделить в отдельную переменную и затем многократно вызвать в различных местах программы.

Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->. Этот оператор разделяет лямбда-выражение на две части: левая часть содержит список параметров выражения, а правая собственно представляет тело лямбда-выражения, где выполняются все действия.

Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе. При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.

***Ссылка на метод***  
Начиная с JDK 8 в Java можно в качестве параметра в метод передавать ссылку на другой метод. В принципе данный способ аналогичен передаче в метод лямбда-выражения.

Ссылка на метод передается в виде имя_класса::имя_статического_метода (если метод статический) или объект_класса::имя_метода (если метод нестатический). 
  
***Встроенные функциональные интерфейсы***  
В JDK 8 вместе с самой функциональностью лямбда-выражений также было добавлено некоторое количество встроенных функциональных интерфейсов, которые мы можем использовать в различных ситуациях и в различные API. В частности,  в Stream API -  прикладном интерфейсе для работы с данными. основные из этих интерфейсов:
  
Predicate<T>  

Consumer<T>  

Function<T,R>  

Supplier<T>  

UnaryOperator<T>  

BinaryOperator<T>  

