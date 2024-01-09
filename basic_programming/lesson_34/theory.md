***Generics***  (перевод см ниже)  
Generics in the Java programming language are entities that can store data of only a specific type. For example, a list of elements that can contain only numbers. But not just that: a generic is a general term for different structures. You can think of a generic as a folder for papers, where you can only place documents of a certain format. This is convenient: it helps to separate different data and prevent situations where the wrong thing is passed to an entity.

Generic entities are sometimes also called parameterized, generic, or parametric entities. Such an entity is created with a special parameter. The parameter allows you to specify the type of data it will work with. Hence the name.
In various sources, you might hear about "type generics," "class generics," or "method generics." This is normal since generalization and parameterization apply to all these entities, and generics are the general term. Java programmers work with generics. Without this capability, writing code that works only with a specific type of data would have been more difficult. There were two ways, both suboptimal:

Specifying type checks in the code. For example, getting data and immediately checking if they're the right ones, and if not, raising an error. This would help filter out unnecessary elements. However, if the class needed to be made more flexible, like creating a variation for a different type, you would have had to rewrite or copy it. You couldn't just pass another special parameter to make the same class work with another type; relying on developers. For instance, leaving a comment in the code "This class works only with numbers." There was too much risk that someone would miss the comment and pass the wrong data to the class object. And it's fortunate if the error is noticed immediately, not only during testing. That's why generics appeared: they solve this problem, make code writing easier, and error prevention more reliable.
How Generics Work
To better understand the working principle, you need to envision how entities in Java are structured. There are classes - these are like "blueprints" of future entities, describing what they do. And there are objects - instances of classes, existing and functioning directly. The class is like a car's diagram, and the object is like the car itself.

When a developer creates a generic class, they attach a parameter to it in triangular brackets - a label. For example, like this:


class MyClass<T> {...}
Now, when creating an object of this class, you'll need to specify the type at the T's position, with which the object will work. For instance, MyClass<Integer> for integers or MyClass<String> for strings. The class itself remains universal, i.e., general. However, each of its objects is specific to its type.

Using generics, you can create one class and then, based on it, multiple objects of this class for different types. There's no need to duplicate code and complicate the program. That's why generics are better and more convenient than type checks directly in the code - otherwise, a separate class would be needed for each data type. Generic Classes and Generic Methods Earlier, we mentioned that generics can apply to different entities. Let's dive into details:

Generic classes are blueprints for objects with a parameter. When creating an object, you pass the type with which it will work.
Generic methods operate on the same principle. A method is a function within an object, describing what it can do. The method's type is passed when called, right before the arguments. This allows creating more versatile functions and applying the same logic to different data types.
  
***Interface Comparable***

In order for objects to be comparable and sortable, they must implement the Comparable interface. When implementing the interface, it's parameterized by the current class.
The Comparable interface contains a single method: int compareTo(E item), which compares the current object with the object passed as a parameter. If this method returns a negative number, then the current object will come before the one passed through the parameter. If the method returns a positive number, then it will be the opposite, with the second object coming after. If the method returns zero, it means both objects are equal.




***Джененрики***  
Дженерики (generics) в языке программирования Java — это сущности, которые могут хранить в себе данные только определенного типа. Например, список элементов, в котором могут быть одни числа. Но не только: дженерик — обобщенный термин для разных структур.
Можно представить дженерик как папку для бумаг, куда нельзя положить ничего, кроме документов определенного формата. Это удобно: помогает разделить разные данные и не допустить ситуаций, когда в сущность передается что-то не то.

Дженерик-сущности еще иногда называют параметризованными, общими или обобщенными. Такая сущность создается со специальным параметром. Параметр позволяет указать, с каким типом данных она будет работать. Отсюда и название.  
В разных источниках можно услышать про «тип-дженерик», «класс-дженерик» или «метод-дженерик». Это нормально, ведь обобщение и параметризация касаются всех этих сущностей, а generics — общий термин.
С дженериками работают программисты на Java. Без этой возможности писать код, который работает только с определенным видом данных, было сложнее. Существовало два способа, и оба неоптимальные:

указывать проверку типа в коде. Например, получать данные — и сразу проверять, а если они не те, выдавать ошибку. Это помогло бы отсеять ненужные элементы. Но если бы класс понадобилось сделать более гибким, например, создать его вариацию для другого типа, его пришлось бы переписывать или копировать. Не получилось бы просто передать другой специальный параметр, чтобы тот же класс смог работать еще с каким-то типом;
полагаться на разработчиков. Например, оставлять в коде комментарий «Этот класс работает только с числами». Слишком велик риск, что кто-то не заметит комментарий и передаст в объект класса не те данные. И хорошо, если ошибка будет заметна сразу, а не уже на этапе тестирования.
Поэтому появились дженерики: они решают эту проблему, делают написание кода проще, а защиту от ошибок надежнее.  

**Как работают дженерики**  
Чтобы вернее понять принцип работы, нужно представлять, как устроены сущности в Java. Есть классы — это как бы «чертежи» будущих сущностей, описывающие, что они делают. И есть объекты — экземпляры классов, непосредственно существующие и работающие. Класс — как схема машины, объект — как машина.

Когда разработчик создает дженерик-класс, он приписывает к нему параметр в треугольных скобках — метку. К примеру, так:

class myClass<T>;

Теперь при создании объекта этого класса нужно будет указать на месте T название типа, с которым будет работать объект. Например, myClass<Integer> <название объекта> для целых чисел или myClass<String> <название объекта> для строк. Сам класс остается универсальным, то есть общим. А вот каждый его объект специфичен для своего типа.

С помощью дженериков можно создать один класс, а потом на основе него — несколько объектов этого класса для разных типов. Не понадобится дублировать код и усложнять программу. Поэтому дженерики лучше и удобнее, чем проверка типа прямо в коде — тогда для каждого типа данных понадобился бы свой класс.
Дженерики-классы и дженерики-методы
Выше мы говорили, что дженериками могут быть разные сущности. Разберемся подробнее:

дженерик-классы (generic classes) — это классы, «схемы» объектов с параметром. При создании объекта ему передается тип, с которым он будет работать; 
  дженерик-методы (generics methods) — это методы, работающие по такому же принципу. Метод — это функция внутри объекта, то, что он может делать. Методу тип передается при вызове, сразу перед аргументами. Так можно создавать более универсальные функции и применять одну и ту же логику к данным разного типа
  
***Интерфейс Comparable***  

Для того, чтобы объекты  можно было сравнить и сортировать, они должны применять интерфейс Comparable<E>. При применении интерфейса он типизируется текущим классом.   
Интерфейс Comparable содержит один единственный метод int compareTo(E item), который сравнивает текущий объект с объектом, переданным в качестве параметра. Если этот метод возвращает отрицательное число, то текущий объект будет располагаться перед тем, который передается через параметр. Если метод вернет положительное число, то, наоборот, после второго объекта. Если метод возвратит ноль, значит, оба объекта равны.  

