let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function reverseArray(arr) {
  let first = 0;
  let last = arr.length - 1;

  while (first < last) {
    let temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;

    first++;
    last--;
  }
  console.log(arr);
}
reverseArray(arr);
