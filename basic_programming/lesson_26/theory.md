***Object-Oriented Programming***  

**Method overriding**  
A derived class can define its own methods or override methods that are inherited from the base class.
An annotation @Override is used before the overridden method. This annotation is generally optional.

When overriding a method, it must have an access level not lower than the access level in the base class. For example, if a method in the base class has a public modifier, then the method in the derived class must also have a public modifier.

Although inheritance is a very interesting and efficient mechanism, in some situations, its application may be undesirable. In such cases, you can prohibit inheritance using the final keyword.
  
  
**Super keyword**    

The super keyword refers to superclass (parent) objects.  

It is used to call superclass methods, and to access the superclass constructor.  

The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.


  
***Объектно-ориентированное программирование***      
**Переопределение методов**   
Производный класс может определять свои методы, а может переопределять методы, которые унаследованы от базового класса.  
Перед переопределяемым методом указывается аннотация @Override. Данная аннотация в принципе необязательна.

При переопределении метода он должен иметь уровень доступа не меньше, чем уровень доступа в базовом класса. Например, если в базовом классе метод имеет модификатор public, то и в производном классе метод должен иметь модификатор public.  
Хотя наследование очень интересный и эффективный механизм, но в некоторых ситуациях его применение может быть нежелательным. И в этом случае можно запретить наследование с помощью ключевого слова final.  

**Ключевое слово super**

Ключевое слово super относится к объектам суперкласса (родителя).

Оно используется для вызова методов суперкласса и доступа к конструктору суперкласса.

Самое распространенное использование ключевого слова super - устранение путаницы между суперклассами и подклассами, у которых есть методы с одинаковым именем.

