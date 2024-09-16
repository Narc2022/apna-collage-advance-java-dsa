function hallowRectangle(row = 10, col = 20) {
  for (let i = 1; i <= row; i++) {
    let line = "";
    for (let j = 1; j <= col; j++) {
      if (i == 1 || j == 1 || i == row || j == col) {
        line += "*";
      } else {
        line += " ";
      }
    }
    console.log(line);
  }
}

hallowRectangle();
