// - Создайте простой таймер на веб-странице, который будет отсчитывать время назад от 60 секунд.
// При достижении 0 секунд таймер должен остановиться.
// - Стилизуйте его

//Вариант 1
// const timer = document.querySelector("#timer");

// const startTimer = () => {
//   let seconds = 60;

//   const updateTimer = () => {
//     timer.textContent = seconds;
//     seconds--;

//     if (seconds < 0) {
//       clearTimeout(timerId);
//     }
//   };
//   const timerId = setInterval(updateTimer, 1000);
// };

// startTimer();

//Вариант 2
const timer = document.querySelector("#timer");
const startButton = document.querySelector(".timer-button");

const startTimer = () => {
  let seconds = 60;

  const updateTimer = () => {
    timer.textContent = seconds;
    seconds--;

    if (seconds < 0) {
      clearTimeout(timerId);
      startButton.removeAttribute("disabled");
    }
  };
  const timerId = setInterval(updateTimer, 1000);

  if (timer.textContent !== 60) {
    startButton.setAttribute("disabled", "");
  }
};

startButton.addEventListener("click", startTimer);
