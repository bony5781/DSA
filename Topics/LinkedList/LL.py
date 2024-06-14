class Node:
    def __init__(self, data=None):
        self.data=data
        self.next=None

class LinkedList:
    def __init__(self):
        self.head = Node()
    
    def appendEnd(self, data):
        new_node = Node(data)
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = new_node
    
    def getLength(self):
        curr = self.head
        l = 0
        while curr.next:
            curr = curr.next
            l += 1
        return l

    def printList(self):
        ele = []
        curr = self.head
        while curr.next:
            curr = curr.next
            ele.append(curr.data)
        print(ele)
    
    def getElementAtIndex(self, index):
        if index>=self.getLength() or index<0:
            print("Error! Index out of range")
            return None
        curr_idx=0
        curr=self.head
        while True:
            curr=curr.next
            if curr_idx==index:
                return curr.data 
            curr_idx += 1
    
    def popElementAtIndex(self,index):
        if index>=self.getLength() or index<0:
            print("Error! Index out of range")
            return
        curr_idx=0
        curr = self.head
        while True:
            last_node=curr
            curr = curr.next
            if curr_idx==index:
                last_node.next = curr.next
                return curr.data
            curr_idx+=1

obj = LinkedList()
obj.append(0)
obj.append(1)
obj.append(2)
obj.append(3)
obj.printList()
print(obj.popElementAtIndex(3))
obj.printList()        