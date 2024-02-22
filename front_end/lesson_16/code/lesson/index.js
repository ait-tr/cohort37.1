let buttonResult = document.querySelector(".result-button");
let result = document.querySelector(".result");

let calculateIdealWeight = () => {
  const form = document.querySelector("#form");
  let height = form.height.value;
  let gender = form.gender.value;

  if (height && gender) {
    let idealWeight;
    if (gender === "male") {
      idealWeight = (height - 100) * 1.15;
    } else if (gender === "female") {
      idealWeight = (height - 110) * 1.15;
    }

    result.textContent = `Идеальный вес: ${idealWeight.toFixed(2)}, кг`;
  } else {
    alert("Введите рост и пол");
  }
};

buttonResult.addEventListener("click", calculateIdealWeight);
