const usersData = [
  {
    name: "John Doe",
    age: 25,
    email: "john.doe@example.com",
    city: "New York",
    profession: "Software Engineer",
  },
  {
    name: "Alice Johnson",
    age: 30,
    email: "alice.johnson@example.com",
    city: "Los Angeles",
    profession: "Data Scientist",
  },
  {
    name: "Bob Smith",
    age: 28,
    email: "bob.smith@example.com",
    city: "Chicago",
    profession: "Graphic Designer",
  },
  {
    name: "Eva Davis",
    age: 22,
    email: "eva.davis@example.com",
    city: "Miami",
    profession: "Marketing Specialist",
  },
  {
    name: "David Wilson",
    age: 35,
    email: "david.wilson@example.com",
    city: "San Francisco",
    profession: "Product Manager",
  },
];

const cardsContainer = document.querySelector(".cards-container");
const getDataButton = document.querySelector(".get-data-button");

const createCard = (userObject) => {
  let userCard = document.createElement("div");
  userCard.innerHTML = `
  <h2 class='card-title'>${userObject.name}</h2>
  <p>Age: ${userObject.age}</p>
  <p>Email: ${userObject.email}</p>
  <p>City: ${userObject.city}</p>
  <p>Profession: ${userObject.profession}</p>
  `;
  return userCard;
};

const getData = () => {
  usersData.forEach((userData) => {
    let card = createCard(userData);
    cardsContainer.append(card);
  });

  cardsContainer.classList.remove("hidden");
  getDataButton.classList.add("hidden");
};

getDataButton.addEventListener("click", getData);
