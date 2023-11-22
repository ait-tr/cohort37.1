***For Loop***

The for loop has the following formal definition:

```java
for ([counter initialization]; [condition]; [counter modification]) {
    // actions
}
```

Let's consider a standard for loop:

```java
for (int i = 1; i < 9; i++) {
    System.out.printf("The square of %d is %d \n", i, i * i);
}
```

The first part of the loop declaration, `int i = 1`, creates and initializes the counter `i`. The counter doesn't necessarily have to be of type int; it could be any numeric type, for example, float. Before the loop begins, the counter's value is set to 1. In this case, it's similar to variable declaration.

The second part is the condition under which the loop will execute. In this case, the loop will execute as long as `i` is less than 9.

The third part is the increment of the counter by one. Again, it's not necessary to increment by one; it could be decremented, like `i--`.

In the end, the loop block will run 8 times until the value of `i` becomes 9. Each time, the value will increase by 1.

It's not mandatory to specify all conditions in the loop declaration. For example, you can write:

```java
int i = 1;

for (; ;) {
    System.out.printf("The square of %d is %d \n", i, i * i);
}
```

The loop definition remains the same, but now the conditions are empty: `for (; ;)`. There is no initialized counter variable, no condition, so the loop will run indefinitely—a infinite loop.

Alternatively, you can omit certain blocks:

```java
int i = 1;

for (; i < 9;) {
    System.out.printf("The square of %d is %d \n", i, i * i);
    i++;
}
```

This example is equivalent to the first one. We still have a counter, but it's created outside the loop. There is a loop execution condition, and the counter is incremented within the for loop block.

The for loop can define and control multiple variables simultaneously:

```java
int n = 10;

for (int i = 0, j = n - 1; i < j; i++, j--) {
    System.out.println(i * j);
}
```

***Continue and Break Statements***

The `break` statement allows you to exit the loop at any point, even if the loop hasn't completed its iterations. For example:

```java
for (int i = 0; i < 10; i++) {
    if (i == 5)
        break;
    System.out.println(i);
}
```

When the counter becomes 5, the `break` statement is triggered, and the loop terminates.

Now, let's modify it so that if the number is 5, the loop doesn't terminate but simply moves to the next iteration using the `continue` statement:

```java
for (int i = 0; i < 10; i++) {
    if (i == 5)
        continue;
    System.out.println(i);
}
```

In this case, when the loop reaches the number 5, the program will skip it and move on to the next iteration.





***Цикл for***

Цикл for имеет следующее формальное определение:

for ([инициализация счетчика]; [условие]; [изменение счетчика])
{

// действия

}

Рассмотрим стандартный цикл for:

for (int i = 1; i < 9; i++){

System.out.printf("Квадрат числа %d равен %d \n", i, i * i);

}


Первая часть объявления цикла - int i = 1 создает и инициализирует счетчик i. Счетчик необязательно должен представлять тип int. Это может быть и любой другой числовой тип, например, float. Перед выполнением цикла значение счетчика будет равно 1. В данном случае это то же самое, что и объявление переменной.

Вторая часть - условие, при котором будет выполняться цикл. В данном случае цикл будет выполняться, пока i не достигнет 9.

И третья часть - приращение счетчика на единицу. Опять же нам необязательно увеличивать на единицу. Можно уменьшать: i--.

В итоге блок цикла сработает 8 раз, пока значение i не станет равным 9. И каждый раз это значение будет увеличиваться на 1.

Нам необязательно указывать все условия при объявлении цикла. Например, мы можем написать так:

int i = 1;

for (; ;){

System.out.printf("Квадрат числа %d равен %d \n", i, i * i);

}

Определение цикла осталось тем же, только теперь блоки в определении у нас пустые: for (; ;). Теперь нет инициализированной переменной-счетчика, нет условия, поэтому цикл будет работать вечно - бесконечный цикл.

Либо можно опустить ряд блоков:

int i = 1;

for (; i<9;){

System.out.printf("Квадрат числа %d равен %d \n", i, i * i);

i++;

}

Этот пример эквивалентен первому примеру: у нас также есть счетчик, только создан он вне цикла. У нас есть условие выполнения цикла. И есть приращение счетчика уже в самом блоке for.

Цикл for может определять сразу несколько переменных и управлять ими:

int n = 10;

for(int i=0, j = n - 1; i < j; i++, j--){

    System.out.println(i * j);  

***Операторы continue и break***

Оператор break позволяет выйти из цикла в любой его момент, даже если цикл не закончил свою работу:

Например:

for (int i = 0; i < 10; i++){

if (i == 5)

break;

System.out.println(i);
}

Когда счетчик станет равным 5, сработает оператор break, и цикл завершится.

Теперь сделаем так, чтобы если число равно 5, цикл не завершался, а просто переходил к следующей итерации. Для этого используем оператор continue:

for (int i = 0; i < 10; i++){

if (i == 5)

continue;

System.out.println(i);

В этом случае, когда выполнение цикла дойдет до числа 5, программа просто пропустит это число и перейдет к следующему.
}


}