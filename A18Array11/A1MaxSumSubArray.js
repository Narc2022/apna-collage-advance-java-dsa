let arr = [1, -2, 6, -1, 3];

function findMaxSum(arr) {
  let maxSum = 0;
  let currentSum = 0;
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length; j++) {
      currentSum = 0;
      for (k = i; k <= j; k++) {
        currentSum += arr[k];
      }
      if (currentSum > maxSum) {
        maxSum = currentSum;
      }
    }
  }
  console.log("Maximum sum of sub array is " + maxSum);
}

findMaxSum(arr);
