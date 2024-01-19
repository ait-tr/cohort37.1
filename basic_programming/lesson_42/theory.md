Перевод см.ниже  

**Exceptions**  
A significant part of a programmer's work involves dealing with errors, often their own.

It just so happens that there are no people who do not make mistakes, and the same goes for programs.

Of course, the main thing when working on an error is to understand its cause. And there can be many reasons for errors in a program.

At one point, the creators of Java faced the question of what to do with these potential errors in programs. Avoiding them entirely is impossible. Programmers can write things that are impossible to imagine :)

So, it's necessary to incorporate a mechanism for handling errors into the language. In other words, if an error occurs in a program, there needs to be a script for further action. What should the program do when an error occurs?

Today, we will get acquainted with this mechanism, and it is called "Exceptions."

**Types of Exceptions**
- IOException
- ArithmeticException
- ArrayIndexOutOfBoundsException
- NumberFormatException

**Error Messages**  
Java specifies in error messages:
- The error's name (usually clear, such as ArithmeticException)
- Additional information (/ by zero)
- Class and method (Task.main)
- File and line number with the error (Task.java:15)

**Exception Handling and Catching**  
To work with exceptions in Java, special code blocks exist: try, catch, and finally.

The code in which a programmer expects exceptions to occur is placed within a try block. This doesn't mean that an exception will definitely occur at that point. It means that it might happen, and the programmer is aware of it.

The type of error you expect to receive is placed in a catch block. All the code that needs to be executed if an exception occurs is placed here.

```java
try {
    System.out.println("Dividing by zero");
    System.out.println(366/0); // An exception will be thrown in this line
} catch (ArithmeticException e) {
    System.out.println("Error! Cannot divide by zero!");
}
```

**Exception Behavior**  
As soon as an exception occurs in a line of code within the try block, the code after it will not be executed. The program execution will immediately jump to the catch block.

```java
try {
    System.out.println("Dividing by zero");
    System.out.println(366/0); // An exception will be thrown in this line
    System.out.println("This");
    System.out.println("code");
    System.out.println("will");
    System.out.println("not");
    System.out.println("be");
    System.out.println("executed!");
} catch (ArithmeticException e) {
    System.out.println("The program jumped to the catch block!");
    System.out.println("Error! Cannot divide by zero!");
}
```

**Multiple Catch Blocks**  
There can be multiple catch blocks if the code in the try block can throw different types of exceptions.

```java
int[] numbers = {1, 2, 3, 4};
try {
    for (int i = 0; i <= numbers.length; ++i) {
        System.out.println(5.0 / (3 - numbers[i]));
    }
} catch (ArithmeticException e) {
    System.out.println("Error! Division by zero!");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Error! Array index out of bounds!");
}
```

**Checked and Unchecked Exceptions**  
All exceptions have a common superclass called Throwable.

There are two major categories: exceptions (Exception) and errors (Error).

Errors are critical runtime errors related to the Java virtual machine's operation. In most cases, errors do not need to be handled because they indicate serious issues in the code.

Common errors include StackOverflowError (e.g., when a method endlessly calls itself) and OutOfMemoryError (e.g., when there is not enough memory for creating new objects).

Exceptions, on the other hand, are unexpected situations during program execution. They are less severe than errors but still require attention.

In Java, exceptions are divided into two types: checked and unchecked. Checked exceptions must be either caught or declared using the "throws" keyword in your code.

For unchecked exceptions, catching or declaring them is not mandatory. By default, all exceptions must be caught.

**The Finally Block**  
Finally, let's talk about the "finally" block. It is the last part of the try-catch-finally exception handling trio.

Its special feature is that it always executes, regardless of how the program behaves.

If the code inside the try block executes without throwing an exception, the finally block will be executed at the end.

If the code inside the try block is interrupted, and the program jumps to the catch block, the finally block will still be executed after the code inside the catch block.

Why is it needed?

Its main purpose is to execute essential parts of the code, parts that must be executed no matter what.

For example, it is often used to release resources used by the program.



  
  
  


***Исключения***  
Огромная часть работы программиста — это работа с ошибками. Причем чаще всего — со своими собственными.

Так уж сложилось, что не бывает людей, которые не допускают ошибок. И программ таких тоже не бывает.

Конечно, главное при работе над ошибкой — понять ее причину. А причин таких в программе может быть целая куча.

В один прекрасный момент перед создателями Java встал вопрос: что делать с этими самыми потенциальными ошибками в программах? Избежать их полностью — нереально. Программисты могут понаписать такого, что невозможно даже представить :)

Значит, надо заложить в язык механизм работы с ошибками. Иными словами, если уж в программе произошла какая-то ошибка, нужен сценарий для дальнейшей работы. Что именно программа должна делать при возникновении ошибки?

Сегодня мы познакомимся с этим механизмом. И называется он “Исключения” (Exceptions).

**Разновидности исключений**  
IOException  
ArithmeticException  
ArrayIndexOutOfBoundsException  
NumberFormatException  
  
**Вид сообщений об ошибке**  
Exception in thread "main" java.lang.ArithmeticException: / by zero
at Task.main(Task.java:15)    

В сообщений об ошибки Java указывает:

название ошибки (обычно понятное — ArithmeticException, например),  
дополнительную информацию (/ by zero),  
класс и метод (Task.main)  
файл и номер строки с ошибкой (Task.java:15)


***Перехват и обработка исключений***  
Для работы с исключениями в Java существуют специальные блоки кода: try, catch и finally.  

Код, в котором программист ожидает возникновения исключений, помещается в блок try. Это не значит, что исключение в этом месте обязательно произойдет. Это значит, что оно может там произойти, и программист в курсе этого.

Тип ошибки, который ты ожидаешь получить, помещается в блок catch (“перехват”). Сюда же помещается весь код, который нужно выполнить, если исключение произойдет.
  
try {  
System.out.println("Делим число на ноль");  
System.out.println(366/0);//в этой строчке кода будет выброшено исключение  
} catch (ArithmeticException e) {  
System.out.println("Ошибка! Нельзя делить на ноль!");  
}  

**Поведение исключений**  
Как только в какой-то строчке кода в блоке try возникнет исключение, код после нее уже не будет выполнен. Выполнение программы сразу “перепрыгнет” в блок catch.  


try {  
System.out.println("Делим число на ноль");  
System.out.println(366/0);//в этой строчке кода будет выброшено исключение  
System.out.println("Этот");  
System.out.println("код");  
System.out.println("не");  
System.out.println("будет");  
System.out.println("выполнен!");  
} catch (ArithmeticException e) {    
System.out.println("Программа перепрыгнула в блок catch!");  
System.out.println("Ошибка! Нельзя делить на ноль!");  
}  
Вывод:  

Делим число на ноль  
Программа перепрыгнула в блок catch!  
Ошибка! Нельзя делить на ноль!  
Несколько блоков catch  
Блоков catch может быть несколько.  

Если код в блоке try может выбросить не один, а несколько видов исключений, для каждого из них можно написать свой блок catch.
  
int[] numbers = {1, 2, 3, 4};  
try {  
for (int i = 0; i <= numbers.length; ++i) {  
System.out.println(5.0 / (3 - numbers[i]));  
}   
} catch (ArithmeticException e) {  
System.out.println("Ошибка! Деление на 0!");  
} catch (ArrayIndexOutOfBoundsException e) {  
System.out.println("Ошибка! Программа вышла за границы массива!");  
}    

**Проверяемые (checked) и непроверяемые (unchecked) исключения  **  
У всех исключений есть общий класс-предок Throwable.    

От него происходят две большие группы — исключения (Exception) и ошибки (Error).

**Разновидности ошибок и исключений**  

Error — это критическая ошибка во время исполнения программы, связанная с работой виртуальной машины Java. В большинстве случаев Error не нужно обрабатывать, поскольку она свидетельствует о каких-то серьезных недоработках в коде.

Наиболее известные ошибки: StackOverflowError — возникает, например, когда метод бесконечно вызывает сам себя, и OutOfMemoryError — возникает, когда недостаточно памяти для создания новых объектов.

Как видишь, в этих ситуациях чаще всего обрабатывать особо нечего — код просто неправильно написан и его нужно переделывать.

Exceptions — это, собственно, исключения: исключительная, незапланированная ситуация, которая произошла при работе программы.

Это не такие серьезные ошибки, как Error, но они требуют нашего внимания.

В Java все исключения делятся на два типа – контролируемые/проверяемые (checked) и неконтролируемые/непроверяемые (unchecked): те, которые перехватывать обязательно, и те, которые перехватывать не обязательно. По умолчанию – все исключения обязательно нужно перехватывать.

В своем коде ты сам можешь выкидывать исключения. Ты даже можешь написать свои собственные исключения. Но это мы разберем позже. Сейчас же давай научимся работать с исключениями, которые выбрасывает Java-машина.

О проверяемых исключениях мы обязаны предупредить в коде, для этого используется служебное слово throws:

public static void main() throws IOException  
Чтобы программа скомпилировалась, метод, который вызывает method1 в примере ниже, должен сделать две вещи: или перехватить эти исключения или пробросить их дальше (тому, кто его вызвал), указав их в своём заголовке.

Ты уже сталкивался с несколькими непроверяемыми исключениями: ArithmeticException возникает при делении на ноль ArrayIndexOutOfBoundsException возникает при попытке обратиться к ячейке за пределами массива.

Теоретически, конечно, создатели Java могли бы ввести обязательную обработку таких исключений, но во что бы тогда превратился код? При любой операции деления чисел пришлось бы писать try-catch для проверки — не на ноль ли ты случайно делишь? При любом обращении к массиву надо было бы писать try-catch чтобы проверить, не вышел ли ты за эти пределы.

Любой написанный код был бы совершенно нечитаемым. Логично, что от этой идеи отказались.

Поэтому непроверяемые исключения не нужно обрабатывать в блоках try-catch или пробрасывать наверх, хотя технически это возможно, как и с Error.
  
**Оператор finally**  
В завершение мы поговорим о блоке finally. Это последняя часть триумвирата обработки исключений try-catch-finally.

Его особенность в том, что он выполняется при любом сценарии работы программы.

Если код в блоке try выполнится целиком и не выбросит исключения, в конце сработает блок finally.

Если код внутри try прервется, и программа перепрыгнет в блок catch, после того, как отработает код внутри catch, все равно будет выбран блок finally.
  
Зачем он нужен?  

Его главное назначение — выполнить обязательную часть кода; ту часть, которая должна быть выполнена независимо от обстоятельств.

Например, в нем часто освобождают какие-то используемые программой ресурсы.
