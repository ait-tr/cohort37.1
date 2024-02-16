// Тернарный оператор
let studentName = "Mary";
let message;

if (studentName === "Tom") {
  message = "Hi, Tom";
} else if (studentName === "Mary") {
  message = "Hi, Mary";
} else {
  message = "Hi";
}

let userMessage =
  studentName === "Tom"
    ? "Hi, Tom"
    : studentName === "Mary"
    ? "Hi, Mary"
    : "Hi";
console.log(message);

// Switch case
let randomDay = Math.round(Math.random() * 10);
console.log(randomDay);
let dayName;

switch (randomDay) {
  case 1:
    dayName = "Monday";
    break;
  case 2:
    dayName = "Tuesday";
    break;
  case 3:
    dayName = "Wednesday";
    break;
  case 4:
    dayName = "Thursday";
    break;
  case 5:
    dayName = "Friday";
    break;
  case 6:
    dayName = "Saturday";
    break;
  case 7:
    dayName = "Sunday";
    break;
  default:
    dayName = "Invalid day";
}

console.log(dayName);

// Логические операторы

// let isStudent = confirm("Are you a student?");
// console.log(isStudent);
// let isEmployee = confirm("Are you a employee?");
// console.log(isEmployee);

// if (isStudent || isEmployee) {
//   console.log("discount");
// } else {
//   console.log("no discount");
// }

let age = Math.round(Math.random() * 100);
console.log(age);
let hasDrivingLicense = true;
let isSick = true;

if (age >= 18 && hasDrivingLicense && !isSick) {
  console.log("You can drive a car");
} else {
  console.log("You can`t drive a car");
}

// Шаблонные строки
// let guestName = prompt("Name");
// let guestMessage = `Hi, ${guestName}. Welcom`;
// console.log(message);

//Массивы
let arrayUsers = ["Mike", "Tom", "Bob"];
console.log(arrayUsers);
console.log(arrayUsers[1]);
console.log(arrayUsers[0]);
console.log(arrayUsers.length);

let userData = ["Tom", 42, true, [200, 400, 700]];
let userName = userData[0];
let prices = userData[3];
let price = userData[3][2];
console.log(price);
console.log(userData);

let colors = ["Red", "Blue"];
console.log(colors);
let deletedColor = colors.shift();
console.log(colors);
console.log(deletedColor);

let colorNewArrayLength = colors.unshift("Yellow", "Green");
console.log(colors);
console.log(colorNewArrayLength);

colors.pop();
console.log(colors);

colors.push("Grey", "Pink");
console.log(colors);

colors[6] = "Black";
console.log(colors);
console.log(colors[5]);
colors[2] = true;
console.log(colors);

// Циклы
for (let i = 1; i <= 5; i++) {
  let square = i ** 2;
  console.log(square);
}

let fruits = ["Apple", "Mango", "Orange", "Banana"];

for (let i = 0; i < fruits.length; i++) {
  console.log(`Fruit at index ${i}: ${fruits[i]}`);
}

for (let fruit of fruits) {
  console.log(`Fruit: ${fruit}`);
}
