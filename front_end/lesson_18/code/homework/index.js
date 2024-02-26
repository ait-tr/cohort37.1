const spaceship = {
  name: "Star Voyager",
  manufacturer: "Galactic Innovations",
  crew: 50,
  maxSpeed: "9.5",
};

// const spaceship = undefined;

let spaceshipName = document.querySelector("#spaceship-name");
let spaceshipManufacturer = document.querySelector("#spaceship-manufacturer");
let spaceshipCrew = document.querySelector("#spaceship-crew");
let spaceshipMaxSpeed = document.querySelector("#spaceship-max-speed");
let hideManufacturerButton = document.querySelector(
  ".hide-manufacturer-button"
);
let spaceshipContainer = document.querySelector(".spaceship-container");

//1 вариант
// spaceshipName.textContent = `Name: ${spaceship.name}`;
// spaceshipManufacturer.textContent = `Manufacturer: ${spaceship.manufacturer}`;
// spaceshipCrew.textContent = `Crew: ${spaceship.crew}`;
// spaceshipMaxSpeed.textContent = `Max speed: ${spaceship.maxSpeed}`;

// const hideManufacturer = () => {
//   spaceshipManufacturer.style.display = "none";
// };

// hideManufacturerButton.addEventListener("click", hideManufacturer);

//2 вариант
if (spaceship !== undefined) {
  let spaceshipNameValue = spaceship.name ? spaceship.name : "-";
  let spaceshipManufacturerValue = spaceship.manufacturer
    ? spaceship.manufacturer
    : "-";
  let spaceshipCrewValue = spaceship.crew ? spaceship.crew : "-";
  let spaceshipMaxSpeedValue = spaceship.maxSpeed ? spaceship.maxSpeed : "-";

  spaceshipName.textContent = `Name: ${spaceshipNameValue}`;
  spaceshipManufacturer.textContent = `Manufacturer: ${spaceshipManufacturerValue}`;
  spaceshipCrew.textContent = `Crew: ${spaceshipCrewValue}`;
  spaceshipMaxSpeed.textContent = `Max speed: ${spaceshipMaxSpeedValue}`;
} else {
  spaceshipContainer.textContent = "Loading...";
}

const hideManufacturer = () => {
  let spaceshipManufacturerValue = '-';
  spaceshipManufacturer.textContent = `Manufacturer: ${spaceshipManufacturerValue}`;
};

hideManufacturerButton.addEventListener("click", hideManufacturer);