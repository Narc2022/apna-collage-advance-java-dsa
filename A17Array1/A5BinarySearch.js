let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let key = 6;

function binarySearch(arr, key) {
  let start = 0;
  let end = arr.length - 1;

  while (start <= end) {
    let mid = Math.floor((start + end) / 2);

    if (arr[mid] == key) {
      console.log(mid);
      return;
    }

    if (arr[mid] < key) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }
  console.log(-1);
  return;
}

binarySearch(arr, key);
