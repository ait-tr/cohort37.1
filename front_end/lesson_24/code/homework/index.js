// - Создайте функцию delay, которая принимает число (value) и возвращает промис.
//Промис должен разрешиться через 5 секунд и вернуть удвоенное значение аргумента value (в resolve). Если аргумент не является числом, промис должен быть отклонен с текстом ошибки "The argument is not a number" (в reject)

// - Создайте функцию processingDelay, которая принимает число (value) и затем передаёт его в вызов функции delay.
//Вызов функции delay нужно обработать с помощью then и catch. Внутри then и catch нужно просто вывести соответствующий результат в консоль

// - Для демонстрации результата вызовите функцию processingDelay два раза:
//  - 1 раз с аргументом value - 10
//  - 2 раз с аргументом value - 'text'

const delay = (value) => {
  const promise = new Promise((resolve, reject) => {
    setTimeout(() => {
      if (typeof value === "number") {
        let result = value * 2;
        resolve(result);
      } else {
        let error = "The argument is not a number";
        // reject(error);
        reject(new Error(error));
      }
    }, 5000);
  });

  return promise;
};

const processingDelay = (value) => {
  delay(value)
    .then((result) => {
      console.log(`Resolved: ${result}`);
    })
    .catch((error) => {
      console.log(`Rejected: ${error.message}`);
    });
};

processingDelay(10);
processingDelay("text");

// let value = Number('10');
// processingDelay(value);
// processingDelay(true);
