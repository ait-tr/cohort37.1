let temperature = prompt("Введите температуру");
//temperature='';

if (temperature < 0) {
  console.log("Холодно!");
} else if (temperature === null || temperature === '') {
  console.log("Вы ничего не ввели");
} else if (temperature <= 20) {
  console.log("Прохладно");
} else if (temperature <= 30) {
  console.log("Тепло");
} else if (temperature > 30) {
  console.log("Жарко!");
} else {
  console.log("Введите числовое значение");
}
