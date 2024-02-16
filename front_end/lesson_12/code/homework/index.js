let temperature = prompt("Введите температуру");

if (temperature < 0) {
  console.log("Холодно!");
} else if (temperature === null) {
  console.log("Вы отменили ввод");
} else if (temperature <= 20) {
  console.log("Прохладно");
} else if (temperature <= 30) {
  console.log("Тепло");
} else if (temperature > 30) {
  console.log("Жарко!");
} else {
  console.log("Введите числовое значение");
}
