// Создание класса и его экземпляров
class Wizard {
  constructor(name, house) {
    this.name = name;
    this.house = house;

    // this.introduce = function () {
    //   console.log(`I'm ${this.name} from ${this.house} house`);
    // };
  }

  introduce() {
    console.log(`I'm ${this.name} from ${this.house} house`);
  }
}

const harry = new Wizard("Harry Potter", "Gryffindor"); //экземпляр класса Wizard - объект harry
harry.introduce();
harry.introduce = function () {
  console.log(`My name is ${this.name}`);
};
harry.introduce();
console.log(harry);

const hermiona = new Wizard("Hermiona Granger", "Gryffindor");
console.log(hermiona);
hermiona.introduce();

// наследование классов

class DarkWizard extends Wizard {
  constructor(name, house, darkPower) {
    super(name, house);
    this.darkPower = darkPower;
  }

  useDarkPower() {
    console.log(`${this.name} uses dark power: ${this.darkPower}`);
  }
}

const voldemort = new DarkWizard(
  "Lord Voldemort",
  "Slytherin",
  "Avada Kedavra"
); //экземпляр класса DarkWizard - объект voldemort

console.log(voldemort);
voldemort.introduce();
voldemort.useDarkPower();

//приватные свойства и методы
class WizardPrivate {
  #privateField;

  constructor(name, house) {
    this.name = name;
    this.house = house;
    this.course = 1;
    this.#privateField = "Secret";
  }

  #privateMethod() {
    console.log(`This is private method - ${this.#privateField}`);
  }

  revealMethod() {
    console.log(`My secret is ${this.#privateField}`);
    this.#privateMethod();
  }
}

const jinny = new WizardPrivate("Jinny Weasly", "Gryffindor"); //экземпляр класса WizardPrivate - объект jinny
console.log(jinny);
console.log(jinny.name);
// console.log(jinny.#privateField);
// jinny.#privateMethod();
jinny.revealMethod();
console.log(jinny.course);

//геттеры и сеттеры
class WizardGetSet {
  #name;
  constructor(name, house) {
    this.#name = name;
    this.house = house;
  }

  get name() {
    return `${this.#name} Weasley`;
  }

  set name(newName) {
    if(newName!==''){
      this.#name = newName;
    } else {
      console.log('Enter name')
    }
  }
}

const ron = new WizardGetSet("Ron", "Gryffindor"); //экземпляр класса WizardGetSet - объект ron
console.log(ron.name);
ron.name = "";
console.log(ron.name);
// ron.house = "Slytherin";
// console.log(ron.house);

