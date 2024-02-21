//Add element
//1 step
let newElement = document.createElement("li");
console.log(newElement);
//2 step
newElement.textContent = "Your first element";
console.log(newElement);
//3 step
let list = document.querySelector(".list");
// list.append(newElement);
// list.prepend(newElement);
// list.after(newElement);
list.before(newElement);
// document.querySelector('.list').list.before(newElement);

//Change elements
let mainTitle = document.querySelector(".main-title");
let mainTitleText = mainTitle.textContent;
console.log(mainTitleText);

let listElements = list.innerHTML;
console.log(listElements);
console.log(typeof listElements);

let userCardTitle = document.querySelector("h2");
userCardTitle.innerHTML = "User fired";

mainTitle.style.color = "#2b5547";
document.querySelector(".main-container").style.backgroundColor = "#f4f7c3";

userCardTitle.remove();

//events
//show-hide card
let hideCardButton = document.querySelector(".card-button");
let showCardButton = document.querySelector(".show-button");
let card = document.querySelector("#container");

let hideCard = () => {
  card.style.display = "none";
};

let showCard = () => {
  card.style.display = "flex";
};

hideCardButton.addEventListener("click", hideCard);
showCardButton.addEventListener("click", showCard);

//input
let searchField = document.querySelector("#search");

// let funcChange = (eventT) => {
//   console.log(eventT.target.value);
//   alert(eventT.target.value);
// };

searchField.addEventListener("change", (eventT) => {
  console.log(eventT.target.value);
  alert(eventT.target.value);
});

//preventDefault
let link = document.querySelector("a");

let changeDefault = (event) => {
  event.preventDefault();
  //любые действия
  alert("User not found");
};

link.addEventListener("click", changeDefault);

//Form
let getDataButton = document.querySelector(".getData");

let getDataFunction = () => {
  const form = document.querySelector("#main-form");
  console.log(form);
  let nameField = form.elements["userName"].value;
  console.log(nameField);
  let passwordField = form.password.value;
  console.log(passwordField);
  console.log(nameField, passwordField);
};

getDataButton.addEventListener("click", getDataFunction);

/*примечание: ошибка в форме отсутствовала, но из-за 
  комментирования строк в html:
  <input id='search' name="search" placeholder="search" />
  <button type="button" class="card-button">Hide card</button>
  сломался код выше в строке 47 */
