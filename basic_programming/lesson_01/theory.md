Learning a programming language typically begins with the 'Hello, World!' program, which displays this text on the screen.

Hello, World!
In the Java language, this program will look like this:

```java
class Main { 
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

At this stage, it doesn't matter that the text "Hello, World!" appears on the screen thanks to the `System.out.println()` command, where `println()` is an abbreviation for "print line" in English. It displays the value specified within the parentheses ("Hello, World!" in this case), which is a string. The string itself is enclosed in double quotation marks (""). If you don't do this, the compiler will point out a syntax error.

  
  
  


Изучать язык программирования обычно начинают с программы 'Hello, World!', которая выводит этот текст на экран.
```console
Hello, World!
```
В языке Java эта программа будет выглядеть так:
```java
  class Main { 
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
```
На данном этапе нам не важно,
Текст *Hello, World!* появится на экране благодаря команде `System.out.println()`, где `println()` - это сокращение от английского *print line*. Она выводит на экран значение, указанное в скобках `("Hello, World!")`, в данном случае строку. Сама строка обрамляется двойными кавычками "". Если этого не сделать, то компилятор укажет на синтаксическую ошибку.
