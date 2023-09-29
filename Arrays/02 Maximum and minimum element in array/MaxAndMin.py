import sys

def MaxAndMin(arr, n):
    smallest = sys.maxsize;
    largest = -sys.maxsize-1; 
    for i in range(n):
        if(arr[i] > largest):
            largest =  arr[i]
        if(arr[i] < smallest):
            smallest = arr[i];
    
    return (smallest,largest);

print(MaxAndMin([3,1,5,7],4))
