let arr = [5, 4, 1, 3, 2];

function bubbleSort(arr) {
  for (turn = 0; turn < arr.length; turn++) {
    for (let j = 0; j < arr.length - 1 - turn; j++) {
      if (arr[j] > arr[j + 1]) {
        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
  console.log(arr);
}

bubbleSort(arr);
