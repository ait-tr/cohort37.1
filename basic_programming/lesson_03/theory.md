
Type byte

The byte data type is an 8-bit signed integer.

The minimum value is -128 (-2^7).

The maximum value is 127 (inclusive) (2^7-1).

Default value is 0.

The byte type is designed to save space in large arrays, mainly instead of integers, as byte is four times smaller than int.
Example:
byte a = 100;
byte b = -50;

Type short

The short data type is a 16-bit signed integer.

The minimum value is -32768 (-2^15).

The maximum value is 32,767 (inclusive) (2^15-1).

The short type in Java can also be used to save memory like byte. The size of short is 2 times smaller than int.
Default value is 0.

Example:
short s = 10000;
short r = -20000;

Type int

In the Java language, the int data type is a 32-bit signed integer.

The minimum size of int is -2,147,483,648 (-2^31).

The maximum value is 2,147,483,647 (inclusive) (2^31-1).

The int type is usually used for integer values. If there is no concern about memory.
Default value is 0.

Example:
int a = 100000;
int b = -200000;

Type long

The long data type is a 64-bit signed integer.

The minimum value is -9,223,372,036,854,775,808 (-2^63).

The maximum value is 9,223,372,036,854,775,807 (inclusive). (2^63-1).
In Java, it is applied when a wider range than int is required.

Default value is 0L.

Example:
long a = 100000L;
long b = -200000L;

Type float

The float data type is a 32-bit single-precision IEEE 754 floating point number.
The float type is mainly used to save memory in large arrays of floating point numbers.
Default value is 0.0f.
The float type should never be used for precise values, such as currency.

Example:
float f1 = 234.5f;

Type double

The double data type is a 64-bit double-precision IEEE 754 floating point number.
Usually used for decimal values.
The double type should never be used for precise values, such as currency.
Default value is 0.0d.
Example:
double d1 = 123.4;






Тип byte

Тип данных byte является 8-разрядным знаковым целым числом.

Минимальная величина равна -128 (-27).

Максимальное значение равно 127 (включительно) (27-1).

По умолчанию – 0.

byte предназначен для экономии места в больших массивах, главным образом вместо целых чисел, поскольку byte в четыре раза меньше, чем int.
Пример:
byte a = 100;
byte b = -50;

Тип short

Тип данных short является 16-разрядным знаковым целым числом.

Минимальное значение равно -32768 (-215).

Максимальная величина равна 32 767 (включительно) (215-1).

Тип short в Java может также использоваться для экономии памяти как byte. Размер short в 2 раза меньше, чем int.
По умолчанию – 0.

Пример:
short s = 10000;
short r = -20000;

Тип int

В языке Java тип данных int является 32-разрядным знаковым целым числом.

Минимальный размер int – 2 147 483 648 (-231).

Максимальная величина равна 2,147,483,647 (включительно)(231-1).

Тип int обычно используется для целых значений. Если нет озабоченности по поводу памяти.
По умолчанию равно 0.

Пример:
int a = 100000;
int b =-200000;

Тип long

Тип данных long является 64-разрядным знаковым целым числом.

Минимальное значение равно – 9,223,372,036,854,775,808 (-263).

Максимальная величина – 9,223,372,036,854,775,807 (включительно). (263-1).
В Java Применяется когда требуется более широкий диапазон, чем int.

По умолчанию – 0L.

Пример:
long a = 100000L;
long b =-200000L;



Тип float

Тип данных float является c одинарной точностью 32-битный IEEE 754 с плавающей точкой.
Тип float используется главным образом для сохранения памяти в больших массивах чисел с плавающей точкой.
По умолчанию – 0.0f.
Тип float никогда не должен применяется для точного значения, например, валюты.

Пример:
float f1 = 234.5f;


Тип double

Тип данных double является c двойной точностью 64-битный IEEE 754 с плавающей точкой.
Обычно используется для десятичных значений.
Тип double никогда не должен применяется для точного значения, например, валюты.
По умолчанию – 0.0d.
Пример:
double d1 = 123.4;
