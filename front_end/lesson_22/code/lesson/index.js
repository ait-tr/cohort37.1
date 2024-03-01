// setTimeout
const delayedFunction = () => {
  console.log("Функция выполниться через 3 секунды");
};

setTimeout(delayedFunction, 3000); //3000ms = 3s

//

const greet = (userName, userAge, isAdmin) => {
  console.log(`Hello ${userName} - ${userAge} - ${isAdmin}`);
};

setTimeout(greet, 2000, "Ted", 23, true);

//

console.log("1");
console.log("2");
setTimeout(() => {
  console.log("3");
}, 0);
console.log("4");
setTimeout(() => {
  console.log("5");
}, 3000);
console.log("6");

//

setTimeout(() => {
  console.log("1");
}, 3000);

setTimeout(() => {
  console.log("2");
}, 3000);

//

const showMessage = (ms) => {
  const messageTimer = ms / 1000;

  const alertMessage = () => {
    console.log(`Прошло ${messageTimer} секунды`);
  };

  setTimeout(alertMessage, ms);

  console.log("2");
};

showMessage(4000);

console.log("1");

//setInterval
const simpleCounter1 = () => {
  let count = 1;

  let countFunc = () => {
    console.log(count);
    count++;

    if (count > 5) {
      clearInterval(intervalId);
    }
  };

  const intervalId = setInterval(countFunc, 1000);
};

simpleCounter1();

//

const simpleCounter2 = () => {
  let count = 1;

  const intervalId = setInterval(() => {
    console.log(count);
    count++;
  }, 2000);

  console.log(intervalId);

  setTimeout(() => {
    clearInterval(intervalId);
    console.log(intervalId);
  }, 7000);
};

simpleCounter2();

//callback
const fetchData = (callback) => {
  //ассинхронная операция, например, запрос к серверу
  setTimeout(() => {
    const data = "error";
    callback(data);
  }, 3000);
};

const processData = (data) => {
  if (data === "error" || data === "") {
    console.log("Перезагрузите страницу");
  } else {
    console.log(`Обработка данных: ${data}`);
  }
};

fetchData(processData);

console.log("Код идет дальше");

// callback hell

const cookBacon = (callback) => {
  console.log("Cooking bacon...");
  setTimeout(() => {
    console.log("Bacon is done!");
    callback();
  }, 3000);
};

const cookEggs = (callback) => {
  console.log("Cooking eggs...");
  setTimeout(() => {
    console.log("Eggs are done!");
    callback();
  }, 4000);
};

const toastBread = (callback) => {
  console.log("Toasting bread...");
  setTimeout(() => {
    console.log("Toast is done!");
    callback();
  }, 2000);
};

const cookMeet = (callback) => {
  console.log("Cooking meet...");
  setTimeout(() => {
    console.log("Meet is done!");
    callback();
  }, 4000);
};

toastBread(() => {
  cookBacon(() => {
    cookEggs(() => {
      cookMeet(() => {
        console.log("Sandwich is ready");
      });
    });
  });
});
