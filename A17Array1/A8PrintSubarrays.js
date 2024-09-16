let arr = [2, 4, 6, 8, 10];

function printSubArray(arr) {
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length; j++) {
      let newArr = [];
      for (let k = i; k <= j; k++) {
        newArr.push(arr[k]);
      }
      if (newArr.length) {
        console.log("newArr", newArr);
      }
    }
  }
}
printSubArray(arr);
