//Promise.all
const promise1 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Операция 1 завершена успешно");
  }, 3000);
});

const promise2 = new Promise((resolve, reject) => {
  setTimeout(() => {
    // resolve("Операция 2 завершена успешно");
    reject("Операция 2 завершена неудачно");
  }, 5000);
});

const promise3 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Операция 3 завершена успешно");
    // reject("Операция 3 завершена неудачно");
  }, 1000);
});

Promise.all([promise1, promise2, promise3])
  .then((result) => {
    console.log(result);
    console.log(`Выполнено успешно: ${result}`);
  })
  .catch((error) => {
    console.log(typeof error);
    console.log(`Выполнено c ошибкой: ${error}`);
  });

//Promise.race
const promise4 = new Promise((resolve, reject) => {
  setTimeout(() => {
    // resolve("Операция 4 завершена успешно");
    reject("Операция 4 завершена неудачно");
  }, 1000);
});

const promise5 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Операция 5 завершена успешно");
    // reject("Операция 5 завершена неудачно");
  }, 5000);
});

const promise6 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Операция 6 завершена успешно");
    // reject("Операция 6 завершена неудачно");
  }, 1000);
});

Promise.race([promise4, promise5, promise6])
  .then((result) => {
    console.log(result);
    console.log(typeof result);
    console.log(`PromiceRace - выполнен успешно: ${result}`);
  })
  .catch((error) => {
    console.log(error);
    console.log(typeof error);
    console.log(`PromiceRace - выполнен c ошибкой: ${error}`);
  });

// let response = {
//   personalData: {
//     name: "Tom",
//   },
//   workData: {
//     role: "admin",
//   },
// };

//async...await
const timer = 3001;

//имитация запроса по сети
const promise = new Promise((resolve, reject) => {
  const userData = {
    firstName: "Tom",
    lastName: "Green",
    age: 45,
  };
  setTimeout(() => {
    if (timer > 3000) {
      reject("Error");
    } else {
      resolve(userData);
    }
  }, 2000);
});

const getUserData = async () => {
  try {
    const result = await promise;
    console.log(result);
  } catch (error) {
    console.log(error);
  }
};

getUserData();
