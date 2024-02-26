//Деструктуризация массива
const arrayColor = ["Red", "Blue", "Green"];
const newArrayColor = [...arrayColor];
console.log(arrayColor);
console.log(newArrayColor);
console.log(arrayColor === newArrayColor);

arrayColor[1] = "Grey";
console.log(arrayColor);
console.log(newArrayColor);

const doubleArrays = [...newArrayColor, ...arrayColor];
console.log(doubleArrays);
console.log(arrayColor);
console.log(newArrayColor);

//Деструктуризация объекта
const bookObj = {
  bookName: "Great Gatsby",
  author: "Fitzgerald",
  price: 200,
};

const newBookObj = { ...bookObj };
// console.log(bookObj);
// console.log(newBookObj);
// console.log(bookObj===newBookObj);

newBookObj.price = 300;
console.log(bookObj);
console.log(newBookObj);

newBookObj.bookStore = "Store name;";
console.log(newBookObj);

const doubleBookObj = { ...newBookObj, ...bookObj };
console.log(doubleBookObj);

//Передача аргументов функции

const sum = (a, b, c = 0) => a + b + c;

const numbers = [3, 50, 10];

console.log(sum(...numbers)); // sum(3, 50, 20);

// Деструктурирующее присваивание (массивы)
const fruits = ["apple", "orange"];
const [fruit_1, fruit_2] = fruits;
//const fruit_1 = fruits[0];
//const fruit_2 = fruits[1];
console.log(fruit_1);
console.log(fruit_2);
// console.log(fruit_3);

// Деструктурирующее присваивание (объекты)
const fruitObj = {
  nameFruit: "Lemon",
  price: 10,
};

// let {price: fruitPrice, nameFruit, shop} = fruitObj;
let { price: fruitPrice, nameFruit } = fruitObj;
console.log(fruitPrice);
console.log(nameFruit);
// console.log(shop);

//Получение массива ключей/значений
const person = {
  name: "John",
  age: 23,
  city: ["City", 23],
  isAdmin: true,
};

const keyArrays = Object.keys(person);
console.log(keyArrays);

const valuesArrays = Object.values(person);
console.log(valuesArrays);

let arrayCity = person.city;

//Метод map
const words = ["apple", "cherry", "fruits"];
console.log(words);

const wordsLength = words.map((word) => word.length);
console.log(wordsLength);

const wordsObjects = words.map((word, index) => {
  return {
    wordEl: word,
    position: index + 1,
  };
});
console.log(wordsObjects);

//Метод forEach
const numbersAr = [1, 2, 3];
numbersAr.forEach((num) => console.log(num));

let newNumAr = numbersAr.forEach((num, index, array) => {
  // array[index] = num*2;
  return num;
});

let newNumArWithMap = numbersAr.map((num, index, array) => {
  // return num;
  console.log(num);
});

console.log(newNumArWithMap);
// console.log(numbersAr);
console.log(newNumAr);

//filter
const products = [
  { name: "Pr1", price: 200 },
  { name: "Pr2", price: 240 },
  { name: "Pr3", price: 150 },
];

// const filteredAr = products.filter((product) => product.price >= 200);
const filteredAr = products.find((product) => product.price >= 200);
console.log(filteredAr);

//работа с DOM
// const stringAr = ["Red", "Blue", "Green", 'Black'];
// const pageContainer = document.querySelector(".page-container");

// const elements = stringAr.map((item) => {
//   const divEl = document.createElement("div");
//   divEl.textContent = item;
//   return divEl;
// });

// console.log(elements);

// elements.forEach((element) => pageContainer.append(element));
