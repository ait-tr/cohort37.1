// Нужно создать веб-страницу, на которой будут расположены три кнопки.
// Действия, которые должны происходить при нажатии на кнопки:
// Первая кнопка меняет цвет фона всей страницы
// Вторая кнопка меняет название первой кнопки
// Третья кнопка добавляет заголовок на страницу

let changeBackgroundButton = document.querySelector(
  ".change-background-button"
);
let changeNameButton = document.querySelector(".change-name-button");
let addTitleButton = document.querySelector(".add-title-button");
let pageContainer = document.querySelector(".page-container");
let containerButtons = document.querySelector(".container");
let secondTitle = document.querySelector("h2");

let changeBackground = () => (pageContainer.style.background = "#f2c884");

let changeButtonName = () => {
  changeBackgroundButton.textContent = "New name";
};

let title = document.createElement("h1");
let addTitle = () => {
  // title.textContent = "Main title";
  // containerButtons.before(title);

  title.textContent = "Main title";
  secondTitle.after(title);
};

changeBackgroundButton.addEventListener("click", changeBackground);
changeNameButton.addEventListener("click", changeButtonName);
addTitleButton.addEventListener("click", addTitle);
