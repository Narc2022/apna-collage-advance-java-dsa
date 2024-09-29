let arr = [5, 4, 1, 3, 2, 7];

function selectionSort(arr) {
  for (let turn = 0; turn < arr.length - 1; turn++) {
    let smallPos = turn;
    for (let j = turn; j < arr.length; j++) {
      if (arr[smallPos] > arr[j]) {
        smallPos = j;
      }
    }
    let temp = arr[smallPos];
    arr[smallPos] = arr[turn];
    arr[turn] = temp;
  }
  console.log("arr", arr);
}

selectionSort(arr);
