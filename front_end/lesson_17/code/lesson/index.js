//создание объекта
const emptyPerson = {};
console.log(emptyPerson);

const person = {
  name: "Tom",
  age: 23,
  isAdmin: true,
};

console.log(person);

let userName = person.name; //получение (копирование) значения свойства name
console.log(userName);

person.name = "Bob"; //изменение значения свойства name
console.log(person);
console.log(person.name);
userName = person.name;
console.log(userName);

//добавление свойства в person
person.phone = "+4579999030";
console.log(person);

//добавление свойства в person с помощью брекет синтаксиса
person["likes dogs"] = true;
console.log(person);

//возврат значения с помощью брекет синтаксиса
console.log(person["likes dogs"]);
console.log(person["age"]);

//удаление свойств объекта
delete person.age;
console.log(person);

//оператор in
// console.log("age" in person);

//for..in -цикл выводит ключи
for (let key in person) {
  console.log(person[key]); //1 итерации - person["name"]
}

//сложная структура объекта
const mainShop = {
  shop: "Book store",
  books: {
    price: 300,
    names: ["Book1", "Book2", "Book3"],
  },
  sayHi() {
    console.log("Hi");
  },
  //  function sayHi () {
  //   console.log("Hi");
  // },
};

console.log(mainShop.books.names[1]);
mainShop.sayHi();

//Reference type
let price = 200;
let newPrice = price;
console.log(price, newPrice);
price = 300;
console.log(price, newPrice);

const clientData = {
  company: "Company name",
  clientName: "Bill",
};

const userData = {
  company: "Company name",
  clientName: "Bill",
};
// userData = {};
// console.log(userData);

console.log(clientData===userData);

const newClient = clientData;
console.log(clientData);
console.log(newClient);

clientData.company = "New name";
console.log(clientData);
console.log(newClient);

newClient.clientName = "Tom";
console.log(clientData);
console.log(newClient);

console.log(newClient === clientData);


//Пример работы с дом
// let title = document.querySelector('h1');

// title.textContent = `User name: ${userData.clientName}`;

