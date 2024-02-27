//reduce
const numberArray = [2, 30, 3, 50];
const result = numberArray.reduce((acc, num, index) => {
  console.log(`Acc - ${acc}, num - ${num}, index - ${index}`);
  return acc + num;
}, 0);
console.log(result);

const products = [
  { name: "Laptop", price: 200 },
  { name: "Phone", price: 400 },
  { name: "Tablet", price: 600 },
];

const totalPrice = products.reduce((totalP, product) => {
  console.log(
    `totalP - ${totalP}, product - ${product}, product price - ${product.price}`
  );
  return totalP + product.price;
}, 100);

console.log(totalPrice);

// reverse
const fruit = ["apple", "orange", "grape", "banana"];

const fruitReverseAr = fruit.reverse();
console.log(fruitReverseAr);
console.log(fruit);

//join
const newFruit = ["apple", "orange", NaN, "grape", "banana"];

const fruitStr = newFruit.join(" ");
console.log(fruitStr);
