//prototypes
const band = {
  bandName: "Rock band",
};

const musician = {
  isSing: true,
  isPlay: true,
  play() {
    console.log("Bum");
  },
  __proto__: band,
};

const eltonJohn = {
  name: "Elton John",
  __proto__: musician,
  // __proto__: band
};

const michaelJackson = {
  name: "Michael Jackson",
};

// console.log(eltonJohn.name);

console.log(eltonJohn.__proto__);
console.log(musician.__proto__);
console.log(band.__proto__);

eltonJohn.play();

Object.setPrototypeOf(michaelJackson, musician);
michaelJackson.play();
console.log(Object.getPrototypeOf(michaelJackson));

//this
const person = {
  name: "Bill",
  introduce() {
    console.log(`Hello, ${this.name}`);
  },
};

const newPerson = {
  name: "Tom",
  // __proto__: person,
};

// newPerson.introduce();

function hello() {
  console.log(`User - ${this.name}`);
}

person.sayPerson = hello;
newPerson.sayUser = hello;

person.sayPerson();
newPerson.sayUser();

//this - стрелочные функции
const obj = {
  name: "Jane",
  greet: () => {
    console.log(`Name: ${this.name}`);
  },
};

obj.greet();

//глобальный объект
console.log(window);
// var wow = 'wow';

//call,apply,bind
function greetFunc(name, age) {
  console.log(`Hello, ${name} - ${age}! My name is ${this.name}`);
}

const johnObj = {
  name: "John Doe",
  position: "Developer",
};

const janeObj = {
  name: "Jane Doe",
  position: "Designer",
};

greetFunc.call(johnObj, "Kate", 23);
// greetFunc.call(janeObj, "Kate", 23);

greetFunc.apply(janeObj, ["Tom", 45]);

const greetFuncWithObj = greetFunc.bind(johnObj, "Bob", 35);
greetFuncWithObj(33);
// console.log(greetFuncWithObj);
