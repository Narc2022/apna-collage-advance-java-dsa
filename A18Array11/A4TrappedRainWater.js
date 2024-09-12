let height = [4, 2, 0, 6, 3, 2, 5];

function tappedRainWater(height) {
  let allOccupied = 0;
  // LeftMax
  let leftMax = [];
  leftMax[0] = height[0];
  for (let i = 1; i < height.length; i++) {
    let value = Math.max(height[i], leftMax[i - 1]);
    leftMax[i] = value;
  }

  //  RightMax

  let rightMax = [];
  rightMax[height.length - 1] = height[height.length - 1];
  for (let i = height.length - 2; i >= 0; i--) {
    let val = Math.max(height[i], rightMax[i + 1]);
    rightMax[i] = val;
  }
  console.log("rightMax", rightMax);
  console.log("leftMax", leftMax);

  for (let i = 0; i < height.length; i++) {
    let wholeWater = Math.min(rightMax[i], leftMax[i]);
    let water = wholeWater - height[i];

    allOccupied += water;
  }
  console.log("allOccupied", allOccupied);
}

tappedRainWater(height);
