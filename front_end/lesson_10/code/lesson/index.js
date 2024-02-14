// console.log("Внешний файл");

// Переменная let
let _message;
_message = "Hi";
_message = 1;
console.log(_message);

// Копирование значения переменной
let age = 23;
console.log(age);
_message = age;
console.log(_message);
console.log(age);

// Константа
const price = 400;
console.log(price);
// price=age;

// работа с typeof
let userName = "Tom";
let year = 2007;
let isGlobal = true;
let productPrice = undefined;
let func = () => {};
let array = [];
let symbol = Symbol();

console.log(typeof userName);
