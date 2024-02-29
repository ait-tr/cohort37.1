// Создать персонажей для игры с помощью прототипного наследования и this

// Создайте объект character, представляющий следующие характеристики и действие для всех персонажей:

// свойства name (имя), health (здоровье), level (уровень)
// метод introduce для character, который выводит в консоль информацию о персонаже, например:
//"Hello, my name is [name], I am at level [level], and I have [health] health." - на квадратные скобки не обращайте внимание, они для схемы, чтобы указать на переменные значения

// Создайте объект warrior, который будет наследовать свойства и методы от character, также при создании объекта добавьте в него:
// свойства name (имя), health (здоровье), level (уровень), weapon (оружие)
// метод attack, который выводит сообщение в консоль о нападении и название оружия (внутри использовать значение из weapon)

// Создайте объект wizard, наследующий свойства и методы от character, также при создании объекта добавьте в него:
// свойства name (имя), health (здоровье), level (уровень), spell (заклинание)
// метод castSpell, который выводит сообщение в консоль о том, как персонаж произносит заклинание (внутри использовать значение из spell).

// Результат должен состоять из следующих действий:
// вызова метода introduce для каждого из объектов
// вызова метода attack для объекта warrior
// вызова метода castSpell для объекта wizard

const character = {
  name: "User",
  health: 100,
  level: 1,
  introduce() {
    console.log(
      `Hello, my name is ${this.name}, I am at level ${this.level}, and I have ${this.health} health.`
    );
  },
};

const warrior = {
  // __proto__: character,
  name: "Conan",
  health: 90,
  level: 10,
  weapon: "Sword",
  attack() {
    console.log(`I'm attacking with ${this.weapon}`);
  },
};
warrior.__proto__ = character;


const wizard = {
  // __proto__: character,
  name: "Merlin",
  health: 110,
  level: 11,
  spell: "Firestorm",
  castSpell() {
    console.log(`I'm using ${this.spell}`);
  },
};

Object.setPrototypeOf(wizard, character);

character.introduce();
warrior.introduce();
wizard.introduce();

warrior.attack();

wizard.castSpell();