const prices = [100, 400, 900, 300, 500, 451];

const pricesContainer = document.querySelector(".prices-container");
const filterButton = document.querySelector(".filter-button");

// //Вариант 1
// const pricesArrayElements = prices.map((price) => {
//   const priceContainer = document.createElement("div");
//   priceContainer.textContent = price;
//   return priceContainer;
// });

// pricesArrayElements.forEach((priceContainer) =>
//   pricesContainer.append(priceContainer)
// );

// const filterPrices = () => {
//   pricesContainer.innerHTML = "";

//   const filteredPricesArray = prices.filter((price) => price > 450);

//   const filteredPricesArrayElements = filteredPricesArray.map(
//     (filteredPrice) => {
//       const filteredPriceContainer = document.createElement("div");
//       filteredPriceContainer.textContent = filteredPrice;
//       return filteredPriceContainer;
//     }
//   );

//   filteredPricesArrayElements.forEach((filteredPrice) =>
//     pricesContainer.append(filteredPrice)
//   );
// };

// filterButton.addEventListener("click", filterPrices);


// //Вариант 2
// prices.forEach((price) => {
//   const priceContainer = document.createElement("div");
//   priceContainer.textContent = price;
//   pricesContainer.append(priceContainer);
// });

// const filterPrices = () => {
//   pricesContainer.innerHTML = "";

//   const filteredPricesArray = prices.filter((price) => price > 450);

//   filteredPricesArray.forEach((filteredPrice) => {
//     const filteredPriceContainer = document.createElement("div");
//     filteredPriceContainer.textContent = filteredPrice;
//     pricesContainer.append(filteredPriceContainer);
//   });
// };

// filterButton.addEventListener("click", filterPrices);


//Вариант 3

const renderPrices = (pricesArray) => {
  pricesContainer.innerHTML = "";

  pricesArray.forEach((price) => {
    const priceContainer = document.createElement("div");
    priceContainer.textContent = price;
    pricesContainer.append(priceContainer);
  });
};

renderPrices(prices);

const filterPrices = () => {
  const filteredPricesArray = prices.filter((price) => price > 450);
  renderPrices(filteredPricesArray);
};

filterButton.addEventListener("click", filterPrices);
