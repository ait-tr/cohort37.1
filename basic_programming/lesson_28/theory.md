***Aggregation in Java***  
Aggregation is a particular type of Association. It represents the has-a relationship between the two classes. The relationship between the two classes is entirely independent, which means if one of the objects of the class gets deleted, it won’t affect the other.

The Aggregate class contains a reference to one more class and is said to be responsible for the class. Each class that is referred to is viewed as a piece of the Aggregate class.

Let’s take an easy example. A student attends a school. After the completion of his studies, he can quickly leave school. That means the end of the student object would not destroy the School object. We can say that the Student ‘has-a’ relationship with the school.  
the school and the student represent two individual entities related to each other by a ‘has-a’ relationship. When an object from the student class is deleted, 
it does not change the object of the School Class. 
Hence, even though the classes are connected, 
there is no interdependence between them.  
  
  
***Composition***  
it is said that Composition is nothing but a restricted type of Aggregation. Let’s have a look at the definition of the concept. Composition in java is a concept which states that there lies a strong relationship between the two objects associated with the given two classes. It is also said to fulfill the “has-a” relationship between the two classes. In composition, the parent class owns the child class which means the child class cannot be a stand-alone entity. We use Composition mainly because it allows us to have Multiple Inheritance in Java, also it will enable us to reuse the code.

Let’s understand this by using a real-life example,

A car needs oil to run, and we know that our car would not be able to start without filling up the gas tank. So this means that even though the car would be useless without the Oil Class, we can say that car and oil have a “has-a” relationship.
