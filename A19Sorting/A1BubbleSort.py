

def bubble_sort(arr):
    for turn in range(len(arr)):
         for val in range(len(arr)-1-turn):
             if arr[val] > arr[val +1]:
                 temp = arr[val]
                 arr[val] = arr[val+1]
                 arr[val+1] = temp
    print(arr)
    
arr=[5,4,1,3,2,7]

bubble_sort(arr)