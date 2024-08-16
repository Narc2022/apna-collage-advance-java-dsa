function decToBin(dec = 30) {
  let pow = 0;
  let binNum = 0;

  while (dec > 0) {
    let rem = dec % 2;
    binNum = binNum + rem * Math.pow(10, pow);
    dec = Math.floor(dec / 2);
    pow++;
  }
  console.log(binNum);
}

decToBin();
