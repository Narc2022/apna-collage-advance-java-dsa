function InvertedRotatedHalfPiramid(row, col) {
  for (let i = 1; i <= row; i++) {
    let line = "";
    for (let j = 1; j <= col - i; j++) {
      line += " ";
    }
    for (let j = 1; j <= i; j++) {
      line += "*";
    }
    console.log(line);
  }
}

InvertedRotatedHalfPiramid(4, 4);
