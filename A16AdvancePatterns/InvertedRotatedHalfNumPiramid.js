function HalfNumPiramid(row, col) {
  for (i = 1; i <= row; i++) {
    let line = "";
    for (let j = 1; j <= col - i; j++) {
      line += " ";
    }
    for (let j = 1; j <= i; j++) {
      line += `${i}`;
    }
    console.log(line);
  }
}

HalfNumPiramid(4, 4);
