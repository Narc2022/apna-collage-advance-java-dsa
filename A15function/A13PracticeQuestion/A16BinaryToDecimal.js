function binToDec(binNum = 11100) {
  let pow = 0;
  let dec = 0;
  while (binNum > 0) {
    let lastNum = binNum % 10;
    dec = dec + lastNum * Math.pow(2, pow);
    binNum = Math.round(binNum / 10);
    pow++;
  }
  console.log(dec);
}
binToDec();
