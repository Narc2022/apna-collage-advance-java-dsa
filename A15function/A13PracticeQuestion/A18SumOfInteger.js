function sumOfInteger(integer) {
  let sum = 0;
  while (integer > 0) {
    let lastNum = integer % 10;
    sum = sum + lastNum;
    integer = Math.floor(integer / 10);
  }
  return sum;
}

console.log("sumOfInteger(234)", sumOfInteger(234463782368743));
