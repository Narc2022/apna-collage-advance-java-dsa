
def selection_sort(arr):
    for turn in range(len(arr)):
        minPos = turn
        print("turn " , turn)
        for val in range(turn+1,len(arr)):
            if(arr[minPos]> arr[val]):
                minPos = val
        
        temp = arr[minPos]
        arr[minPos] = arr[turn]
        arr[turn] = temp

    print(arr)
    
arr=[5,4,1,3,2,7]
selection_sort(arr)