function linearSearch(arr, key) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == key) {
      console.log("Index num is :" + i);
      return;
    }
  }
  console.log("Not Found");
}

linearSearch([1, 3, 45, 34, 39, 67, 89, 31], 30);
