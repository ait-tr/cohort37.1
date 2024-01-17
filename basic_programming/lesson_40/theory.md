***HashMap***

HashMap<K, V> represents a mapping or dictionary where each element represents a "key-value" pair. All keys are unique within the Map object. Such collections make it easy to look up an element if you know the key, which acts as a unique identifier for the object.

Among the methods of HashMap, the following can be highlighted:

clear(): clears the collection.  
containsKey(): returns true if the collection contains key k.  
containsValue(Object v): returns true if the collection contains value v.  
equals(Object obj): returns true if the collection is identical to the collection passed as the obj parameter.  
isEmpty(): returns true if the collection is empty.  
get(Object k): returns the value of the object with a key equal to k.
If such an element is not found, it returns null.      
getOrDefault(Object k, V defaultValue): returns the value of the object with a key equal to k.
If such an element is not found, it returns defaultValue.  
put(K k, V v): adds a new object with key k and value v to the collection. 
If an object with a similar key already exists in the collection, it is overwritten. 
After adding, it returns the previous value for key k if it was already in the collection.
If the key was not in the collection, it returns null.  
putIfAbsent(K k, V v): adds a new object with key k and value v to the collection 
if there is no element with a similar key in the collection.  
keySet(): returns a set of all keys in the mapping.  
values(): returns a set of all values in the mapping.  
putAll(map): adds all objects from the map to the collection.  
remove(Object k): removes the object with key k.  
size(): returns the number of elements in the collection.
To add an object to the collection, you can use the put method, and to retrieve an object by key, you can use the get method.

HashMap also allows you to obtain sets of both keys and values.


***HashMap***

 HashMap<K, V> представляет отображение или иначе говоря словарь, где каждый элемент представляет пару "ключ-значение". При этом все ключи уникальные в рамках объекта Map. Такие коллекции облегчают поиск элемента, если нам известен ключ - уникальный идентификатор объекта.

Среди методов HashMap можно выделить следующие:

clear(): очищает коллекцию

containsKey(): возвращает true, если коллекция содержит ключ k

containsValue(Object v): возвращает true, если коллекция содержит значение v

equals(Object obj): возвращает true, если коллекция идентична коллекции, передаваемой через параметр obj

isEmpty: возвращает true, если коллекция пуста

get(Object k): возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение null

getOrDefault(Object k, V defaultValue): возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение defaultVlue

put(K k, V v): помещает в коллекцию новый объект с ключом k и значением v. Если в коллекции уже есть объект с подобным ключом, то он перезаписывается. После добавления возвращает предыдущее значение для ключа k, если он уже был в коллекции. Если же ключа еще не было в коллекции, то возвращается значение null

putIfAbsent(K k, V v): помещает в коллекцию новый объект с ключом k и значением v, если в коллекции еще нет элемента с подобным ключом.

Set<K> keySet(): возвращает набор всех ключей отображения

values(): возвращает набор всех значений отображения

putAll(map): добавляет в коллекцию все объекты из  map

remove(Object k): удаляет объект с ключом k

size(): возвращает количество элементов коллекции

Чтобы положить объект в коллекцию, используется метод put, а чтобы получить по ключу - метод get. 

HashMap также позволяет получить наборы как ключей, так и значений. 

