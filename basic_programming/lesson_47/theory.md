# Streams (`Stream`) in Java

A stream is a way to work with data without modifying its source. Just like in the real world, you can't turn back or traverse a stream again.

Streams are described in the `java.util.stream` package, with the full class name being `java.util.stream.Stream`.

[Stream Class Documentation](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Stream.html)

# Creating Streams

## Empty Stream
```java
Stream<String> streamEmpty = Stream.empty();
```
This can be useful where you don't want to pass `null` and trigger a `NullPointerException`, for example:
```java
public Stream<String> streamOf(List<String> list) {
  if (list == null || list.isEmpty()) {
    return Stream.empty();
  }
  return list.stream();
}
```

## Stream from a Collection

All collections (`Collection` and its descendants) can create a stream from their existing data using the `.stream()` method:
```java
Collection<String> collection = Arrays.asList("a", "b", "c");
Stream<String> streamOfCollection = collection.stream();
```

## Stream from an Array

You can create a stream from listed elements in the arguments like this:
```java
Stream<String> stream = Stream.of("a", "b", "c");
```
Or you can use the `Arrays.stream` method:
```java
String[] arr = {"a", "b", "c"};
Stream<String> streamOfArrayFull = Arrays.stream(arr);
Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
```

## Primitive Data Type Streams

For streams containing `int`, `long`, and `double`, there are corresponding classes: `IntStream`, `LongStream`, and `DoubleStream`, respectively.

# Working with Streams

Working with streams typically follows these steps:

1. Creation from a data source.
2. Processing using intermediate operations.
3. Termination with a terminal operation.

**Intermediate operations** (also called "lazy" operations) process incoming elements and return a stream. There can be multiple intermediate operations in a processing chain.

Terminal operations (also called "eager" operations) process elements and terminate the stream. There can be only one terminal operation in a processing chain.

## Intermediate Operations

The general idea of intermediate operations "in a chain" should already be familiar to you. This is how working with streams is structured.

- `filter(Predicate predicate)` filters the stream by passing only elements that satisfy the condition.

  `Predicate` is a built-in functional interface, something that returns `true` or `false`, such as a lambda function.

- `map(Function mapper)` allows you to create a function to transform each element into something else.

  The `Function<T,R>` functional interface represents a function that takes an object of type `T` and returns an object of type `R`.

- `limit(long maxSize)` limits the stream to a maximum number of elements.

- `skip(long n)` skips the first `n` elements.

- `sorted()` or `sorted(Comparator comparator)` sorts the stream.

- `distinct()` returns only unique elements.

## Terminal Operations

- `forEach(Consumer action)` applies an action to each element.

  `Consumer` is a functional interface describing an action on each element.

- `count()` returns the number of elements in the stream.

- `collect(Collector collector)` collects the elements into a list, set, or another collection, or joins them into a string.

- `findFirst()` retrieves the first element of the stream.

- `allMatch(Predicate predicate)` returns `true` if all elements in the stream satisfy the condition.

- `anyMatch(Predicate predicate)` returns `true` if at least one element in the stream satisfies the condition.

- `noneMatch(Predicate predicate)` returns `true` if no element in the stream satisfies the condition.

## Collectors

Some collectors are already defined in the `Collectors` class ([documentation](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Collectors.html)).

- `toList()` collects elements into a `List`.

- `toSet()` collects elements into a set.

- `counting()` counts the number of elements.

- `joining()` joins elements into one string.
  - `joining(CharSequence delimiter)`
  - `joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)`

# Example

Let's take the numbers 50, 60, 70, 80, 90, 100, 110, 120.

Filter out those less than 90.

Add 10 to each of the filtered numbers.

Print the first three resulting numbers.

Without streams:
```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
int count = 0;
for (int x : arr) {
  if (x >= 90) {
    continue;
  }
  x += 10;
  count++;
  if (count > 3) {
    break;
  }
  System.out.println(x);
}
```

With streams (with line breaks for clarity):
```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
Arrays.stream(arr)
    .filter(x -> x < 90)
    .map(x -> x + 10)
    .limit(3)
    .forEach(System.out::println);
```

With streams, but without line breaks:
```java
IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
    .filter(x -> x < 90)
    .map(x -> x + 10)
    .limit(3)
    .forEach(System.out::print);
```







# Потоки (`Stream`) в Java

Поток - способ работать с данными, не меняя их источник. Поток, как и в реальном мире, не возможно повернуть назад или обойти повторно.

Потоки описаны в пакете `java.util.stream`, полное имя класса - `java.util.stream.Stream`.

[Документация класса Stream](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Stream.html)

# Создание потоков

## Пустой поток
```java
Stream<String> streamEmpty = Stream.empty();
```
Может пригодиться нам там, где мы не хотим передавать `null` и вызывать `NullPointerException`, например:
```java
public Stream<String> streamOf(List<String> list) {
  if (list == null || list.isEmpty()) {
    return Stream.empty();
  }
  return list.stream();
}
```

## Поток на основе коллекции

Все коллекции (`Collection` и его наследники) могут создать поток на основе имеющихся данных при помощи метода `.stream()`:
```java
Collection<String> collection = Arrays.asList("a", "b", "c");
Stream<String> streamOfCollection = collection.stream();
```

## Поток на основе массива

Поток модно создавать как на основе перечисленных в аргументах данных
```java
Stream<String> stream = Stream.of("a", "b", "c");
```
Так и с использованием метода `Arrays.stream`:
```java
String[] arr = {"a", "b", "c"};
Stream<String> streamOfArrayFull = Arrays.stream(arr);
Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
```

## Потоки объектов примитивных типов

Для потоков, содержащих в себе `int`, `long` и `double`, существуют классы `IntStream`, `LongStream` и `DoubleStream` соответственно.

# Работа с потоками

Работа с потоками обычно выглядит следующим образом:

1. Создание из источника данных
2. Обработка при помощи промежуточных (`intermediate`) операторов.
3. Вызов терминального (`terminal`) оператора.

**Промежуточные операторы** (ещё называют "lazy" - ленивые) обрабатывают поступающие элементы и возвращают стрим. Промежуточных операторов в цепочке обработки элементов может быть много.

Терминальные (ещё называют "eager" - жаждущие) — обрабатывают элементы и завершают работу стрима. Терминальный оператор в цепочке может быть только один.

## Промежуточные операторы

Общая идея промежуточных операторов "в цепочке" вам уже слегка знакома. Именно так может быть устроена работа со строками.

- `filter(Predicate predicate)` фильтрует стрим, пропуская только те элементы, что проходят по условию

   `Predicate` - встроенный функциональный интерфейс. "Что-то", возвращающее `true` или `false` - например, лямбда-функция);
- `map(Function mapper)` даёт возможность создать функцию, с помощью которой мы будем превращать каждый элемент в какой-то другой

   Функциональный интерфейс `Function<T,R>` представляет функцию перехода от объекта типа `T` к объекту типа `R`.
- `limit(long maxSize)` ограничивает стрим по количеству элементов
- `skip(long n)` пропускает n элементов
- `sorted()` или `sorted(Comparator comparator)` сортирует стрим
- `distinct()` возвращает только уникальные элементы

## Терминальные операторы

- `forEach(Consumer action)`

   `Consumer` - "Потребитель" - функциональный интерфейс, описывающий действие с каждым элементом.
- `count()` возвращает количество элементов стрима
- `collect(Collector collector)` собирает итог в список, множество или другую коллекцию, объединяет в строку...
- `findFirst()` вытаскивает первый элемент стрима
- `allMatch(Predicate predicate)` возвращает `true`, если все элементы стрима удовлетворяют условию `predicate`
- `anyMatch(Predicate predicate)` возвращает `true`, если хотя бы один элемент стрима удовлетворяет условию `predicate`
- `noneMatch(Predicate predicate)` возвращает `true`, если ни один элемент стрима не удовлетворяет условию `predicate`

## Коллекторы

Некоторые коллекторы уже описаны в классе `Collectors` ([документация](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Collectors.html)).

- `toList()` собирает элементы в `List`
- `toSet()` cобирает элементы в множество
- `counting()` подсчитывает количество элементов
- `joining()` собирает элементы в одну строку
   - `joining(CharSequence delimiter)`
   - `joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)`

# Пример

Возьмём числа 50, 60, 70, 80, 90, 100, 110, 120.

Отберём те из них, которые меньше 90.

Добавим к каждому отобранному по 10.

Распечатаем первые три получившихся числа.

Без потоков:
```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
int count = 0;
for (int x : arr) {
  if (x >= 90) {
    continue;
  }
  x += 10;
  count++;
  if (count > 3) {
    break;
  }
  System.out.println(x);
}
```

С потоками (и красивыми переносами для большей понятности):
```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
Arrays.stream(arr)
    .filter(x -> x < 90)
    .map(x -> x + 10)
    .limit(3)
    .forEach(System.out::println);
```

С потоками, но без красивых переносов:
```java
IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10).limit(3)
    .forEach(System.out::print);
```
