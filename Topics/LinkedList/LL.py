class Node:
    def __init__(self,val):
        self.val = val
        self.next = None

class LL:
    def __init__(self):
        self.head = None
        print("Created a Linked list object")
        
    def insertHead(self,val):
        temp = Node(val)
        if self.head == None:
            self.head = temp
        else:
            temp.next = self.head
            self.head = temp
    
    def insertTail(self,val):
        temp = Node(val)
        if self.head is None:
            self.insertHead(val)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = temp
        
    def insertSpecificIndex(self, idx, val):
        i = 0
        curr = self.head
        while i != idx - 1 and curr:
            i += 1 
            curr = curr.next
        temp = Node(val)
        if curr.next != None:
            temp.next = curr.next
            curr.next = temp
        else:
            curr.next = temp
    
    def popHead(self):
        if(self.head is None):
            print("Linked list is empty")
            return
        self.head = self.head.next
    
    def popTail(self):
        if(self.head is None):
            print("Linked list is empty")
            return
        
        curr = self.head
        while curr.next.next:
            curr = curr.next
        curr.next = None
    
    def delSpecificIndex(self, idx):
        i = 0
        curr = self.head
        while i != idx - 1 and curr:
            i += 1
            curr = curr.next
        if i != idx - 1:
            print("Invalid position")
            return 
        curr.next = curr.next.next
        
    def findLen(self):
        i = 0
        curr = self.head
        while curr:
            curr = curr.next
            i += 1
        return i
    
    def reverseLL(self):
        prev,curr = None, self.head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        self.head = prev
    
    def printList(self):
        curr = self.head
        while curr:
            print(f"{curr.val} ",end='')
            curr = curr.next
        print()
        return

s1 = LL()
s1.insertHead(10)
s1.insertHead(5)
s1.insertTail(15)
s1.insertTail(20)
s1.printList()
print(s1.findLen())
s1.insertSpecificIndex(3, 16)
s1.printList()
s1.delSpecificIndex(3)
s1.printList()