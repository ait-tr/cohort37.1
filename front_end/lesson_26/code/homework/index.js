// - Нужно создать кнопку "Get Cat Fact", при клике на которую, будет выполняться GET запрос(используйте fetch). В ответе на запрос будет приходить случайный факт о котах
// - url: https://catfact.ninja/fact
// - После того как вы получите успешный ответ, разместите случайный факт о котах у себя на странице
// - Если запрос завершиться ошибкой, её нужно разместить на странице и выделить красным цветом
// - Каждый раз, когда происходит клик на кнопку, должен выполняться новый запрос и приходить новый факт о котах
// - Стилизуйте на ваше усмотрение

const getFactButton = document.querySelector("#get-fact-button");
const dataContainer = document.querySelector(".data-container");

const getInfoAboutCats = async () => {
  try {
    const response = await fetch("https://catfact.ninja/fact", {
      method: "GET",
    });
    const result = await response.json();

    if (!response.ok) {
      throw Object.assign(new Error("Some response error message"), {
        response: result,
      });
    } else {
      dataContainer.classList.remove("error");
      dataContainer.textContent = result.fact;
    }
  } catch (error) {
    console.log(error);
    dataContainer.classList.add("error");
    dataContainer.textContent = error.response.message;
    // dataContainer.textContent = error.message;
  }
};
// setInterval(getInfoAboutCats, 50);

getFactButton.addEventListener("click", getInfoAboutCats);
