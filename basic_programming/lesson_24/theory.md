***Inheritance***

One of the key aspects of object-oriented programming is inheritance. Through inheritance, you can extend the functionality of existing classes by adding new features or modifying existing ones. To declare one class as a subclass of another, you need to use the "extends" keyword after the name of the subclass, followed by the name of the base class.

If constructors are defined in the base class, it is necessary to call one of the base class constructors in the derived class constructor using the "super" keyword. When calling the constructor after the "super" keyword, a list of arguments is provided in parentheses. The call to the base class constructor must be at the very beginning of the derived class constructor.

The derived class has access to all methods and fields of the base class (even if the base class is in another package) except those defined with the "private" modifier. Additionally, the derived class can also add its own fields and methods.




***Наследование***  

Одним из ключевых аспектов объектно-ориентированного программирования является наследование. С помощью наследования можно расширить функционал уже имеющихся классов за счет добавления нового функционала или изменения старого.  
Чтобы объявить один класс наследником от другого, надо использовать после имени класса-наследника ключевое слово extends, после которого идет имя базового класса.  
Если в базовом классе определены конструкторы, то в конструкторе производного классы необходимо вызвать один из конструкторов базового класса с помощью ключевого слова super.  
При вызове конструктора после слова super в скобках идет перечисление передаваемых аргументов. При этом вызов конструктора базового класса должен идти в самом начале в конструкторе производного класса.   
Производный класс имеет доступ ко всем методам и полям базового класса (даже если базовый класс находится в другом пакете) кроме тех, которые определены с модификатором private. При этом производный класс также может добавлять свои поля и методы