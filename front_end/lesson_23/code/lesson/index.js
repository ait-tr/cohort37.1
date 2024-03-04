                                                          //Промисы, состояние промисов
let myPromise = new Promise((resolve, reject) => {
  //отправляем запрос на получение данных пользователя

  // симуляция положительного ответа
  let response = {
    statusResponse: 200,
    data: {
      firstName: "John",
      lastName: "Johnson",
      age: 23,
    },
  };

  // симуляция отрицательного ответа
  // let response = {
  //   statusResponse: 400,
  //   error: {
  //     message: "Bad request",
  //   },
  // };

  setTimeout(() => {
    if (response.statusResponse === 200) {
      resolve(response.data);
    } else {
      reject(response.error);
    }
  }, 7000);
});

console.log(myPromise);

                                                              //Обработка результата промиса - 1
// myPromise
//   .then(
//     (result) => {
//       console.log(`Выполнено успешно: ${result.age}`);
//     },
//     (error) => {
//       console.log(error);
//     }
//   )
//   // .catch((error) => {
//   //   console.log(error);
//   // })
//   .finally((result) => {
//     console.log("Убираем индикатор загрузки");
//     // console.log(result);
//   });

                                                              //Обработка результата промиса- 2
// const pageContainer = document.querySelector(".page-container");
// const loadInd = document.querySelector("#load-ind");

// myPromise
//   .then((userData) => {
//     // userData = response.data
//     const dataElement = document.createElement("div");
//     dataElement.classList.add("success");
//     dataElement.innerHTML = `
//         <h2>User Data</h2>
//         <p>First name: ${userData.firstName}</p>
//         <p>Last name: ${userData.lastName}</p>
//         <p>Age: ${userData.age}</p>
//         `;
//     pageContainer.append(dataElement);
//   })
//   .catch((error) => {
//     // error = response.error
//     const errorElement = document.createElement("div");
//     errorElement.classList.add("error");
//     errorElement.textContent = error.message;
//     pageContainer.append(errorElement);
//   }).finally(()=>{
//     loadInd.style.display = 'none'
//   });

                                                            // изменение состояния несколько раз

let promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    reject("Error");
  }, 3000);
  resolve("Done");
  // reject("Error");
});

console.log(promise);

                                                  //Отправка запроса и обработка результата при нажатии на кнопку
const pageContainer = document.querySelector(".page-container");
const loadInd = document.querySelector("#load-ind");
const getDataButton = document.querySelector("#request-button");

//функция для отправки запроса и получения данных
const fetchData = () => {
  const promise = new Promise((resolve, reject) => {
    //отправка запроса

    // симуляция положительный ответа
    // let response = {
    //   statusResponse: 200,
    //   data: {
    //     firstName: "John",
    //     lastName: "Johnson",
    //     age: 23,
    //   },
    // };

    // симуляция отрицательного ответа
    let response = {
      statusResponse: 400,
      error: {
        message: "Bad request",
      },
    };

    setTimeout(() => {
      if (response.statusResponse === 200) {
        resolve(response.data);
      } else {
        reject(response.error);
      }
    }, 5000);
  });

  return promise;
};

//функция для обработки результата запроса
const getData = () => {
  getDataButton.setAttribute("disabled", "");
  loadInd.classList.remove("hidden");

  fetchData()
    .then((userData) => {
      const dataElement = document.createElement("div");
      dataElement.classList.add("success");
      dataElement.innerHTML = `
            <h2>User Data</h2>
            <p>First name: ${userData.firstName}</p>
            <p>Last name: ${userData.lastName}</p>
            <p>Age: ${userData.age}</p>
            `;
      pageContainer.prepend(dataElement);
    })
    .catch((error) => {
      const errorElement = document.createElement("div");
      errorElement.classList.add("error");
      errorElement.textContent = error.message;
      pageContainer.prepend(errorElement);
    })
    .finally(() => {
      getDataButton.removeAttribute("disabled");
      loadInd.classList.add("hidden");
    });
};

getDataButton.addEventListener("click", getData);
