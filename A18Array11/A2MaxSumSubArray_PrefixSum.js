let arr = [2, 3, 4, 6, 8, 9];
function MaxSumPrefixMethod(arr) {
  let prefixArray = [];
  let maxSum = 0;
  let currSum = 0;
  prefixArray[0] = arr[0];

  for (let i = 1; i < arr.length; i++) {
    prefixArray[i] = prefixArray[i - 1] + arr[i];
  }
  console.log("prefixArray", prefixArray);

  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length; j++) {
      currSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
    }
    if (maxSum < currSum) {
      maxSum = currSum;
    }
  }
  console.log(maxSum);
}

MaxSumPrefixMethod(arr);
