// Циклы while и do...while
let i = 1;
while (i < 5) {
  console.log(i);
  i++;
}

//---

let secretNumber;
do {
  secretNumber = Math.round(Math.random() * 10);
  console.log(secretNumber);
} while (secretNumber !== 5);
console.log("Found secret number!");

//---

let number = 2;
let number1 = ++number;
console.log(number1);
console.log(number);

// // Методы строк
let stringExample = "PleAse select Your aGe";
console.log(stringExample.length);

//---

let upperString = stringExample.toUpperCase();
console.log(upperString);
console.log(stringExample);

//---

let lowerString = stringExample.toLowerCase();
console.log(lowerString);
console.log(stringExample);

//---

let subStr = stringExample.substring(19);
console.log(subStr);

//---

let indexLetter = stringExample.indexOf("s");
console.log(indexLetter);

//---

let strArray = stringExample.split(" ", 2);
console.log(strArray);
console.log(stringExample);

// Функции
function isEven(number) {
  let isEvenNum = number % 2 === 0;
  //  alert(isEvenNum);
  // return isEvenNum;
}
console.log(isEven(487));
let isNumberEven = isEven(4);
console.log(isNumberEven);

// Область видимости
let age = 18;
if (age >= 18) {
  var messageAccess = "Access";
} else {
  var messageFailure = "Failure";
  console.log(messageFailure);
}
console.log(messageAccess);

//---

function showMessage() {
  var message = "Hi";
}

showMessage();
// console.log(message); //здесь будет ошибка

//hoisting
console.log(z);

let x = 12;
const y = 20;
var z = 3;