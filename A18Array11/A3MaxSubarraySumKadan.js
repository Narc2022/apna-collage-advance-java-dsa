const arr = [-2, -3, 4, -1, -2, 1, 5, -3];

function maxSubArraySum(arr) {
  let cs = 0;
  let ms = 0;
  for (let i = 0; i < arr.length; i++) {
    cs = cs + arr[i];
    if (cs < 0) {
      cs = 0;
    }
    if (cs > ms) {
      ms = cs;
    }
  }
  console.log(ms);
}
maxSubArraySum(arr);
