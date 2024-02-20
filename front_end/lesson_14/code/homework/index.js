// Задача 1
// Напишите функцию, которая принимает два числа и возвращает большее значение. 
//Вызов функции присвоить переменной и отобразить результат(переменную) в консоле
       // 1 вариант
// function getBiggerNumber(number1, number2) {
//   let maxNumber = number1 > number2 ? number1 : number2;
//   return maxNumber;
// }

       // 2 вариант
// function getBiggerNumber(number1, number2) {
//   if(number1 > number2){
//     return number1
//   } else if (number1 < number2){
//     return number2
//   } else {
//     return "Значения равны или неверный ввод"
//   }
// }

       // 3 вариант
function getBiggerNumber(number1, number2) {
  let maxNumber =
    number1 > number2
      ? number1
      : number1 < number2
      ? number2
      : "Значения равны или неверный ввод";
  return maxNumber;
}

let maxNumber = getBiggerNumber(-10, 6);
console.log(maxNumber);

         //4 вариант - Math.max(2,3)



// Задача 2
// Напишите функцию, которая принимает строку и число n, а затем возвращает первые n символов строки.
// Для отображения результа работы функции, вызовите её три раза с различными параметрами,
//  результат каждого вызова присвойте отдельной переменной и выведите переменные в консоль
function getSubstring(oldString, n) {
  return oldString.substring(0, n);
}

// let newSubstring1 = getSubstring("Hello", 2);
// let newSubstring2 = getSubstring("Hello", 1);
let newSubstring3 = getSubstring("Hello", 10);
let lengthNewSubstring3 = newSubstring3.length;

console.log(newSubstring3);
console.log(lengthNewSubstring3);

// Задача 3
// Напишите функцию, которая принимает массив и элемент, а затем возвращает true, если элемент присутствует в массиве,
// и false в противном случае (если есть повторения заданного элемента в массиве, то на задачу это никак не влияет).
// Результат вызова функции отобразите в консоле

       // Вариант 1
// function searchElement(customArray, searchElement) {
//   for (let i = 0; i < customArray.length; i++) {
//     if (customArray[i] === searchElement) {
//       return true;
//     }
//   }
//   return false;
// }

      // Вариант 2
function searchElement(customArray, searchElement) {
  return customArray.indexOf(searchElement) !== -1;
}

console.log(searchElement(["a", "b", "c"], "1"));