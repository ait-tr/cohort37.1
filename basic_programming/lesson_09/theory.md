**Methods**

If variables and constants store certain values, then methods contain a set of operators that perform specific actions.

The general definition of methods looks like this:

[modifiers] return_type method_name ([parameters]){

// method body

}

Modifiers and parameters are optional.

By default, the main class of any Java program contains the main method, which serves as the entry point for the program:

```java
public static void main(String[] args) {
    System.out.println("Hello, world!");
}
```

The keywords `public` and `static` are modifiers. Next is the return type. The keyword `void` indicates that the method does not return anything.

After that comes the method name - `main`, and in parentheses, the method parameters - `String[] args`. The method body, which contains all the actions it performs, is enclosed in curly braces.

Method invocation is done in the form:

```java
method_name(arguments);
```

After the method name, parentheses are used to list the arguments - values for the method parameters.

One of the significant advantages of methods is that we can extract common actions into a separate method and then call them multiple times in various parts of the program.

It's also worth noting that to call other methods in the `main` method, which are defined in the same class as the `main` method, they must have the `static` modifier.


***Методы***

Если переменные и константы хранят некоторые значения, то методы содержат  набор операторов, которые выполняют определенные действия.

Общее определение методов выглядит следующим образом:

[модификаторы] тип_возвращаемого_значения название_метода ([параметры]){

// тело метода

}

Модификаторы и параметры необязательны.

По умолчанию главный класс любой программы на Java содержит метод main, который служит точкой входа в программу:

public static void main(String[] args) {

System.out.println("Hello world!");

}

Ключевые слова public и static являются модификаторами. Далее идет тип возвращаемого значения. Ключевое слово void указывает на то, что метод ничего не возвращает.

Затем идут название метода - main и в скобках параметры метода - String[] args. И в фигурные скобки заключено тело метода - все действия, которые он выполняет.

Вызов метода осуществляется в форме:

имя_метода(аргументы);

После имени метода указываются скобки, в которых перечисляются аргументы - значения для параметров метода.

Одно из важных преимуществ методов заключается в том, что  мы можем вынести некоторые общие действия в отдельный метод и затем вызывать многократно их в различных местах программы.

Также следует отметить, что чтобы вызвать в методе main другие методы, которые определены в одном классе с методом main, они должны иметь модификатор static.