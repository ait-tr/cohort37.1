**Input-Output Streams. File Handling**

A distinguishing feature of many programming languages is their ability to work with files and streams. In Java, the core functionality for working with streams is concentrated in classes from the java.io package.

The key concept here is the concept of a stream. Although the term "stream" in programming is quite overloaded and can denote various concepts, in this context, related to file handling and input-output operations, we will refer to a stream as an abstraction used for reading or writing information (files, sockets, console text, etc.).

A stream is associated with a real physical device through Java's input-output system. We can define a stream that is associated with a file, and through it, we can perform reading or writing of the file. It can also be a stream associated with a network socket, through which data can be sent or received over the network. All these tasks: reading and writing different types of files, exchanging information over the network, input and output to the console, are solved in Java using streams.

An object from which you can read data is called an input stream, and an object to which you can write data is called an output stream. For example, if you need to read the contents of a file, you would use an input stream, and if you need to write to a file, you would use an output stream.

At the foundation of all classes managing byte streams are two abstract classes: InputStream (representing input streams) and OutputStream (representing output streams).

However, working with bytes is not very convenient, so abstract classes Reader (for reading character streams) and Writer (for writing character streams) were added to work with character streams.

All other classes working with streams are descendants of these abstract classes.




***Потоки ввода-вывода. Работа с файлами***  

Отличительной чертой многих языков программирования является работа с файлами и потоками. В Java основной функционал работы с потоками сосредоточен в классах из пакета java.io.

Ключевым понятием здесь является понятие потока. Хотя понятие "поток" в программировании довольно перегружено и может обозначать множество различных концепций. В данном случае применительно к работе с файлами и вводом-выводом мы будем говорить о потоке (stream), как об абстракции, которая используется для чтения или записи информации (файлов, сокетов, текста консоли и т.д.).

Поток связан с реальным физическим устройством с помощью системы ввода-вывода Java. У нас может быть определен поток, который связан с файлом и через который мы можем вести чтение или запись файла. Это также может быть поток, связанный с сетевым сокетом, с помощью которого можно получить или отправить данные в сети. Все эти задачи: чтение и запись различных файлов, обмен информацией по сети, ввод-ввывод в консоли мы будем решать в Java с помощью потоков.

Объект, из которого можно считать данные, называется потоком ввода, а объект, в который можно записывать данные, - потоком вывода. Например, если надо считать содержание файла, то применяется поток ввода, а если надо записать в файл - то поток вывода.

В основе всех классов, управляющих потоками байтов, находятся два абстрактных класса: InputStream (представляющий потоки ввода) и OutputStream (представляющий потоки вывода)

Но поскольку работать с байтами не очень удобно, то для работы с потоками символов были добавлены абстрактные классы Reader (для чтения потоков символов) и Writer (для записи потоков символов).

Все остальные классы, работающие с потоками, являются наследниками этих абстрактных классов. 