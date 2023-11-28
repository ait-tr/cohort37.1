***Arrays***

An array represents a collection of homogeneous values. Declaring an array is similar to declaring a regular variable that holds a single value, and there are two ways to declare an array:

```java
data_type array_name[];
// or
data_type[] array_name;
```

For example, let's define an array of numbers:

```java
int nums[];
int[] nums2;
```

After declaring an array, we can initialize it:

```java
int nums[];
nums = new int[4]; // an array of 4 numbers
```

Array creation is done using the following construction: `new data_type[number_of_elements]`, where `new` is the keyword that allocates memory for the specified number of elements. For example, `nums = new int[4];` in this expression, an array of four `int` elements is created, and each element will have the default value, which is 0.

You can also initialize the array when declaring it:

```java
int nums[] = new int[4]; // an array of 4 numbers
int[] nums2 = new int[5]; // an array of 5 numbers
```

In this initialization, all array elements have default values. For numeric types (including the `char` type), the default value is 0; for the `boolean` type, it is `false`, and for other objects, it is `null`. For example, for the `int` type, the default value is 0, so the `nums` array defined above will consist of four zeros.

However, you can also specify specific values for array elements during its creation:

```java
// These two methods are equivalent
int[] nums = new int[] {1, 2, 3, 5};

int[] nums2 = {1, 2, 3, 5};
```

It's worth noting that in this case, you don't need to specify the array size in square brackets because it is determined by the number of elements in the curly braces.

After creating an array, you can access any of its elements by index, which is passed in square brackets after the array variable name:

```java
int[] nums = new int[4];
// Set values for array elements
nums[0] = 1;
nums[1] = 2;
nums[2] = 4;
nums[3] = 100;

// Get the value of the third array element
System.out.println(nums[2]); // 4
```

Array indexing starts from 0, so in this case, to access the fourth element in the array, you would use the expression `nums[3]`.

Since our array is defined for only 4 elements, we cannot access, for example, the sixth element: `nums[5] = 5;`. If we try to do so, we will get an error.

An important property of arrays is the `length` property, which returns the length of the array, i.e., the number of its elements:

```java
int[] nums = {1, 2, 3, 4, 5};
int length = nums.length; // 5
```

***Массивы***

Массив представляет набор однотипных значений. Объявление массива похоже на объявление обычной переменной, которая хранит одиночное значение, причем есть два способа объявления массива:

тип_данных название_массива[];
// либо
тип_данных[] название_массива;

Например, определим массив чисел:

int nums[];
int[] nums2;

После объявления массива мы можем инициализовать его:
int nums[];
nums = new int[4]; // массив из 4 чисел

Создание массива производится с помощью следующей конструкции: new тип_данных[количество_элементов], где new - ключевое слово, выделяющее память для указанного в скобках количества элементов. Например, nums = new int[4]; - в этом выражении создается массив из четырех элементов int, и каждый элемент будет иметь значение по умолчанию - число 0.

Также можно сразу при объявлении массива инициализировать его:

int nums[] = new int[4]; // массив из 4 чисел
int[] nums2 = new int[5]; // массив из 5 чисел

При подобной инициализации все элементы массива имеют значение по умолчанию. Для числовых типов (в том числе для типа char) это число 0, для типа boolean это значение false, а для остальных объектов это значение null. Например, для типа int значением по умолчанию является число 0, поэтому выше определенный массив nums будет состоять из четырех нулей.

Однако также можно задать конкретные значения для элементов массива при его создании:

// эти два способа равноценны
int[] nums = new int[] { 1, 2, 3, 5 };

int[] nums2 = { 1, 2, 3, 5 };

Стоит отметить, что в этом случае в квадратных скобках не указывается размер массива, так как он вычисляется по количеству элементов в фигурных скобках.

После создания массива мы можем обратиться к любому его элементу по индексу, который передается в квадратных скобках после названия переменной массива:

int[] nums = new int[4];
// устанавливаем значения элементов массива
nums[0] = 1;
nums[1] = 2;
nums[2] = 4;
nums[3] = 100;

// получаем значение третьего элемента массива
System.out.println(nums[2]); // 4

Индексация элементов массива начинается с 0, поэтому в данном случае, чтобы обратиться к четвертому элементу в массиве, нам надо использовать выражение nums[3].

И так как у нас массив определен только для 4 элементов, то мы не можем обратиться, например, к шестому элементу: nums[5] = 5;. Если мы так попытаемся сделать, то мы получим ошибку.

Важнейшее свойство, которым обладают массивы, является свойство length, возвращающее длину массива, то есть количество его элементов:

int[] nums = {1, 2, 3, 4, 5};
int length = nums.length; // 5