            // Функции взаимодействия с пользователем
// alert("Вы на странице");
// let alertResult = alert("Вы на странице");
// console.log(alertResult);

// let promptResult = prompt("Введите свой возраст", 100);
// console.log(typeof promptResult);

// let confirmResult = confirm("Вы согласны?");
// console.log(confirmResult);

// console.log(prompt("Введите свой возраст", 100));

            // Математические операторы
// Сложение
// let number1 = 30;
// let number2 = 20;
// let result = number2 + number1;
// console.log(result);

// Вычетание
// let number1 = 30;
// let number2 = 20;
// // let result = number2 - number1;
// let result = number1 - number2;
// console.log(result);

// Умножение
// let number1 = 334;
// let number2 = 211112;
// let result = number1 * number2;
// console.log(result);

// Деление
// let number1 = 334;
// let number2 = 211112;
// let result = number1 / number2;
// console.log(result);

// Остаток от деления
// let number1 = -1;
// let number2 = 1;
// let result = number1 % number2;
// console.log(result);

// Возведение в степень
// let number1 = 2;
// let number2 = -3;
// let result = number1 ** number2;
// console.log(result);

          // Приведение типов
let string1 = "Hello";
let string2 = "Bob";
let result = string1 + " " + string2;
console.log(result);

let age = "20";
let addYear = 0;
let userName = "Tom";
let isUser = false;
let surname = -Infinity;
// let sum = age + addYear + 3;
let sum = addYear + age + 3;
let newSum = userName + surname;
// let newYear = userName / addYear;
//'Tom' / 2
// let newYear = isUser / addYear;
// true - 1
// false - 0
let newYear = surname / addYear;
// null - 0
// console.log(newSum);

// console.log(Boolean(surname));

          // Инкремент и декремент
let counter = 4;
// counter++;
counter--;
// console.log(counter);

          // Операторы сравнения
console.log(undefined > 5);
console.log(70 < false);
console.log(1 <= true);
console.log(1 >= 9);

let num1 = "12";
let num2 = true;
console.log(num1 == num2);
console.log(num1 === num2);
console.log(num1 != num2);
console.log(num1 !== num2);

          // Условный оператор
let userAge = prompt("Enter your age");

if (userAge > 18) {
  console.log("Hi");
} else if (Number(userAge) === 18) {
  console.log("Ok");
} else {
  console.log("Bye");
}
