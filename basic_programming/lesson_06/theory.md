One of the fundamental elements of many programming languages is conditional statements. These statements allow the program to follow one of the paths based on certain conditions.

In the Java language, the following conditional statements are used: if..else and switch..case.

**if/else Statement**

The if/else statement checks the truth of a certain condition and, depending on the results, executes specific code:

```java
int num1 = 6;
int num2 = 4;

if (num1 > num2) {
    System.out.println("The first number is greater than the second");
}
```

After the "if" keyword, a condition is placed. If this condition is true, the code inside the curly braces after "if" is triggered. In this case, the condition `num1 > num2` is true because the first number is greater than the second. Therefore, the control flow goes to the code block inside the curly braces and executes the instructions there, specifically the `System.out.println("The first number is greater than the second");` method. If the first number were less than or equal to the second, the instructions inside the "if" block would not be executed.

However, if we want some actions to be performed even if the condition is not met, we can add an "else" block:

```java
int num1 = 6;
int num2 = 4;

if (num1 > num2) {
    System.out.println("The first number is greater than the second");
} else {
    System.out.println("The first number is less than or equal to the second");
}
```

When comparing numbers, there are three possible states: the first number is greater than the second, the first number is less than the second, and the numbers are equal. With the "else if" statement, we can handle additional conditions:

```java
int num1 = 6;
int num2 = 8;

if (num1 > num2) {
    System.out.println("The first number is greater than the second");
} else if (num1 < num2) {
    System.out.println("The first number is less than the second");
} else {
    System.out.println("The numbers are equal");
}
```

Multiple conditions can also be combined using logical operators:

```java
int num1 = 8;
int num2 = 6;

if (num1 > num2 && num1 > 7) {
    System.out.println("The first number is greater than the second and greater than 7");
}
```

Here, the "if" block will be executed if both `num1 > num2` and `num1 > 7` are true.



Одним из фундаментальных элементов многих языков программирования являются условные конструкции. Данные конструкции позволяют направить работу программы по одному из путей в зависимости от определенных условий.

В языке Java используются следующие условные конструкции: if..else и switch..case

**Конструкция if/else**

Выражение if/else проверяет истинность некоторого условия и в зависимости от результатов проверки 
выполняет определенный код:

int num1 = 6;
int num2 = 4;

if(num1>num2){

System.out.println("Первое число больше второго");

}

После ключевого слова if ставится условие. И если это условие выполняется, то срабатывает код, который помещен в далее в блоке if после фигурных скобок. В качестве условий выступает операция сравнения двух чисел.

Так как, в данном случае первое число больше второго, то выражение num1 > num2 истинно и возвращает значение true. Следовательно, управление переходит в блок кода после фигурных скобок и начинает выполнять содержащиеся там инструкции, а конкретно метод System.out.println("Первое число больше второго");. Если бы первое число оказалось бы меньше второго или равно ему, то инструкции в блоке if не выполнялись бы.

Но что, если мы захотим, чтобы при несоблюдении условия также выполнялись какие-либо действия? В этом случае мы можем добавить блок else:

int num1 = 6;
int num2 = 4;

if(num1>num2){

System.out.println("Первое число больше второго");

}

else{

System.out.println("Первое число меньше второго");
}
Но при сравнении чисел мы можем насчитать три состояния: первое число больше второго, первое число меньше второго и числа равны. С помощью выражения else if, мы можем обрабатывать дополнительные условия:

int num1 = 6;
int num2 = 8;

if(num1>num2){

System.out.println("Первое число больше второго");
}

else if(num1<num2){

System.out.println("Первое число меньше второго");

}

else{

System.out.println("Числа равны");

}

Также мы можем соединить сразу несколько условий, используя логические операторы:

int num1 = 8;
int num2 = 6;

if(num1 > num2 && num1>7){

System.out.println("Первое число больше второго и больше 7");

}

Здесь блок if будет выполняться, если num1 > num2 равно true и одновременно num1>7 равно true.