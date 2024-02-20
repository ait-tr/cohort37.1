// Function hoisting

// console.log(add(2, 3));
// console.log(divide(2, 3));

function add(number1, number2) {
  return number1 + number2;
}

let divide = function (number1 = 4, number2 = 5) {
  return number1 / number2;
};

console.log(divide());

//Стрелочные функции
let getNumber = (n) => {
  //  return n * 10;
  console.log(n * 30);
};

getNumber(30);

//Функции в качестве параметра
let performOperation = (number1, number2, operation) => {
  let resultOperation = operation(number1, number2);
  return resultOperation + 2;
};

let expoResult = (num1, num2) => num1 * num2;

console.log(performOperation(3, 7, expoResult));
console.log(performOperation(4, 3, (num1, num2) => num1 - num2));
