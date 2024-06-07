class DynamicArray:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.length = 0
        self.temp = [0] * self.capacity
    
    def get(self, i: int):
        if i < 0 or i >= self.length:
            print("Index is out of bounds",end='')
            return
        return self.temp[i]
    
    def set(self, i: int, n: int):
        if i < 0 or i >= self.length:
            print("Index is out of bounds",end='')
            return  
        self.temp[i] = n
    
    def pushback(self, n: int):
        if self.length == self.capacity:
            self.resize()
        self.temp[self.length] = n
        self.length += 1
    
    def popback(self):
        if self.length == 0:
            print("Can't pop from an empty array")
        value = self.temp[self.length - 1]
        self.length -= 1
        return value
    
    def resize(self) -> None:
        self.capacity = 2 * self.capacity
        new_temp = [0] * self.capacity
        
        for i in range(self.length):
            new_temp[i] = self.temp[i]
        self.temp = new_temp
    
    def getSize(self):
        return self.length
    
    def getCapacity(self):
        return self.capacity

dynamic_array = DynamicArray(10)

# Add some elements to the array
dynamic_array.pushback(1)
dynamic_array.pushback(2)
dynamic_array.pushback(3)

# Access elements from the array
print(dynamic_array.get(0))  # Output: 1
print(dynamic_array.get(1))  # Output: 2
print(dynamic_array.get(2))  # Output: 3

