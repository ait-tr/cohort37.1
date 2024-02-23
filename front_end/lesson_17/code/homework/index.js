let sendDataButton = document.querySelector(".send-data-button");
let form = document.querySelector("#user-form");
let userCard = document.querySelector(".user-card");
let formContainer = document.querySelector(".form-container");
let dataContainer = document.querySelector(".data-container");

let sendData = (event) => {
  event.preventDefault();
  let userName = form.userName.value;
  let userSurname = form.surname.value;
  let userEmail = form.email.value;
  let userPhone = form.phone.value;

  userCard.innerHTML = `
  <p>Name: ${userName}</p>
  <p>Surname: ${userSurname}</p>
  <p>Email: ${userEmail}</p>
  <p>Phone number: ${userPhone}</p>
  `;

  formContainer.style.display = "none";
  dataContainer.style.display = "flex";
};

form.addEventListener("submit", sendData);
