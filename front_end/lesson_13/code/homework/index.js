// Задача 1
for (let i = 1; i <= 20; i++) {
  if (i % 2 === 1) {
    continue;
  }
  console.log(i);
}

//Задача 2
// 1 способ
// let array = [2, 4, 6, 8, 10];
// for (let i = 0; i < array.length; i++) {
//   let arrayItem = array[i];
//   console.log((arrayItem *= 2));
// }
// console.log(array);

// 2 способ
let array = [2, 4, 6, 8, 10];
for (let number of array) {
  number*=2;
  console.log(number);
}
console.log(array);

//Задача 3
let numbersArray = [10, 15, 30, 25, 30];
let sum = 0;

for (let i = 0; i < numbersArray.length; i++) {
  sum += numbersArray[i];
}

let result = sum / numbersArray.length;
console.log(result);
