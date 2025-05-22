const numbers = [1, 2, 3, 4, 5, 6, 7, 8];
console.log("Numbers Array:-");
console.log(numbers);
const evenSquares = numbers
  .filter(function(num) {
    return num % 2 === 0;
  })
  .map(function(num) {
    return num * num;
  });
console.log("Even Squares Array:-");
console.log(evenSquares);