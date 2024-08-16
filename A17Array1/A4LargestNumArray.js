function findlgNum(arr = [1, 2, 4, 6, 7, 8, 43, 5, 6]) {
  let largestNum = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > largestNum) {
      largestNum = arr[i];
    }
  }
  console.log(largestNum);
}

findlgNum();
