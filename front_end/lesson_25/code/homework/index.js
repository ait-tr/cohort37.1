// Примечание: в задаче необходимо использовать async/await

// - Создайте функцию showNumbers, которая принимает число секунд и возвращает промис.
// Промис должен выполняться через указанное количество секунд и возвращать сообщение "Прошло {seconds} секунд(ы)". Если аргумент не является числом, промис должен быть отклонен с текстом ошибки "Аргумент не является числом".
//В случае ошибки никакой задержки быть не должно!

// - Создайте функцию wait, которая принимает число секунд и затем передаёт его в вызов функции showNumbers. Результат выполнения промиса должен выводиться в консоль

// Для демонстрации результата вызовите функцию wait 4 раза раза:
//   - 1 раз с аргументом - 3
//   - 2 раз с аргументом - 1
//   - 3 раз с аргументом - 5
//   - 4 раз с аргументом - "7"

const showNumbers = (seconds) => {
  const promise = new Promise((resolve, reject) => {
    // let num = Number(seconds);
    if (typeof seconds !== "number") {
      reject("Аргумент не является числом");
    } else {
      let ms = seconds * 1000;
      setTimeout(() => {
        resolve(`Прошло ${seconds} секунд(ы)`);
      }, ms);
    }
  });
  return promise;
};

const wait = async (sec) => {
  try {
    const result = await showNumbers(sec);
    console.log(result);
  } catch (errorMessage) {
    console.log(errorMessage);
  }
};

wait(3);
wait(1);
wait(5);
wait("7");
