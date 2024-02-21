// Необходимо создать функцию с названием arrayProcessor, которая будет принимать два параметра, первый параметр - массив, второй параметр - функция callback

// Требования:

// Функция arrayProcessor должна выполнять 3 действия:
// первое действие - преобразовать каждый элемент, в переданном массиве, в строку, результат должен сохраняться в новом массиве (то есть не мутировать входной массив)
// вызывать функцию, которая была передана в параметрах (функция callback будет принимать в качестве параметра преобразованный на первом шаге массив)
// возвращать то, что вернула функция callback после её вызова

// Чтобы показать пример использования функции arrayProcessor вам нужно:
// создать ещё две функции (требования к функциям см. в пункте 3)
// вызвать arrayProcessor с каждой из функций по очереди
// каждый из 2-х результатов вывести в консоль

// Требования к функциям callback
// первая функция должна преобразовывать каждый элемент массива в верхний регист и возвращать новый массив с преобразованными элементами
// вторая функция должна возвращать сумму длин всех строк в массиве

let arrayProcessor = (inputArray, operateOnArray) => {
  let stringArray = []; //1
  for (let i = 0; i < inputArray.length; i++) {
    stringArray.push(String(inputArray[i]));
  }
  let resultOperationOnArray = operateOnArray(stringArray); //2
  return resultOperationOnArray; //3
};

let function1 = (initialArray) => {
  let upperCaseStringArray = [];
  for (let i = 0; i < initialArray.length; i++) {
    upperCaseStringArray.push(initialArray[i].toUpperCase());
  }
  return upperCaseStringArray;
};

let function2 = (initialArray) => {
  let sumStrings = 0;
  for (let i = 0; i < initialArray.length; i++) {
    sumStrings += initialArray[i].length;
    // console.log(sumStrings);
  }
  //for(let elementArray of initialArray){
  //   ...
  // sumStrings += elementArray.length;
  // }
  return sumStrings;
};

let userArray= ["Tom", "Bob", "Bill"];

// console.log(arrayProcessor([1, true, "Hi", null], function1));
// console.log(arrayProcessor(["Red", "Blue", "Green "], function2));
console.log(arrayProcessor(userArray, function1));
console.log(arrayProcessor(userArray, function2));
