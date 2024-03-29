use("university");

db.faculties.insertMany([
  {
    name: "Информатика и вычислительная техника",
    students: [
      {
        _id: "1",
        name: "Алексей Иванов",
        diploma: {
          title: "Разработка веб-приложения на React",
        },
      },
      {
        _id: "2",
        name: "Мария Петрова",
        diploma: {
          title: "Применение машинного обучения в финансах",
        },
      },
    ],
  },
  {
    name: "Прикладная математика и физика",
    students: [
      {
        _id: "3",
        name: "Иван Сергеев",
        diploma: {
          title: "Анализ больших данных в биоинформатике",
        },
      },
    ],
  },
  {
    name: "Биоинженерия и биоинформатика",
    students: [
      {
        _id: "4",
        name: "Елена Васильева",
        diploma: {
          title: "Исследование квантовых вычислений",
        },
      },
    ],
  },
  {
    name: "Экономика и управление",
    students: [
      {
        _id: "5",
        name: "Дмитрий Николаев",
        diploma: {
          title: "Разработка игры на Unity",
        },
      },
    ],
    dean: "Андрей Ёлкин",
    documents: ["Устав", "Смета"],
  },
]);

db.teachers.insertMany([
  {
    name: "Андрей Андреев",
    students: ["1", "5"],
  },
  {
    name: "Виктория Семенова",
    students: ["2"],
  },
  {
    name: "Георгий Павлов",
    students: ["3"],
  },
  {
    name: "Светлана Алексеева",
    students: ["4"],
  },
]);
