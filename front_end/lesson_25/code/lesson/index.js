const getDataButton = document.querySelector("#get-button");
const userDataContainer = document.querySelector(".user-data-container");

const getRandomUser = async () => {
  try {
    // в result может лежать как ошибка, например при статусе 400, так и ожидаемые данные при 200
   const response = await fetch("https://randomuser.me/api/");
    // console.log(response);
    const randomUserData = await response.json();

    //проверяем статус ответа, если он в диапазоне от 200-299, то response.ok вернёт true
    if (!response.ok) {
      //если response.ok - false, то нужно сгенерировать ошибку
      // копируем, созданный объект ошибки и добавляем к нему свойство со значением response: randomUserData
      // объект копируем с помощью встроенного метода - Object.assign()
      throw Object.assign(new Error("Some response error message"), {
        response: randomUserData,
      });
    } else {
      const userData = randomUserData.results[0];
      console.log(userData);
      userDataContainer.textContent = `${userData.name.title} ${userData.name.first} ${userData.name.last}, email: ${userData.email}`;
    }
  } catch (error) {
    console.log(error);
  }
};

getDataButton.addEventListener("click", getRandomUser);


//Алгоритм
// 1. Создаём асинхронную функцию по получению и обработке данных getRandomUser
// 2. Отправляем запрос на сервер (fetch) и сохраняем ответ в response
// 3. Обрабатываем содержимое ответа в response с помощью метода json() и получаем результат randomUserData в виде объекта JS
// 4. Пишем условие if...else, в котором генерируем ошибку (выбрасываем),
//в случае если свойство ответа response.ok= false (статус ответа от сервера неудачный 400, 500 и т.д.)
// а в случае если response.ok= true(статус ответа от сервера положительный 200-299) обрабатываем необходимые данные
// 5. В блоке catch обрабатываем ошибку
