class Node:
    def __init__(self, val):
        self.val = val
        self.next  = None
        self.prev = None

class DoublyLL:
    def __init__(self):
        self.head = None
        print("Doubly Linked list object has been created")
        return
    
    def insertHead(self, val):
        temp = Node(val)
        if self.head == None:
            self.head = temp
            self.tail = temp
        else:
            temp.next = self.head
            self.head = temp
        
    def insertTail(self,val):
        temp = Node(val)
        if self.head == None:
            self.head = temp
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = temp
        temp.prev = curr
    
    def insertAtSpecificIndex(self, val, idx):
        if self.head is None:
            self.insertHead(val)
            return
        
        i = 0
        curr = self.head
        temp = Node(val)
        
        while i != idx - 1 and curr.next:
            i += 1
            curr = curr.next
            
        if curr.next == None:
            curr.next = temp
            temp.prev = curr
            return
        
        temp.next = curr.next
        curr.next.prev = temp
        temp.prev = curr
        curr.next = temp

    def popHead(self):
        if self.head.next is None:
            temp = self.head
            self.head = None
            return temp.val
        
        if self.head is None:
            print("Linked list is empty")
        else:
            temp = self.head
            curr = self.head.next
            curr.prev = None
            self.head = curr
            return temp.val
    
    def popTail(self):
        if self.head.next is None:
            temp = self.head
            self.head = None
            return temp.val
        
        if self.head is None:
            print("Linked list is empty")
        else:
            curr = self.head 
            while curr.next.next:
                curr = curr.next
            temp = curr.next 
            curr.next = None
            return temp.val
    
    def popAtSpecifiedIndex(self,idx):
        if self.head is None:
            print("Linked list is empty")
            return        
        if idx == 0:
            self.popHead()
            return
        if idx == self.getLength() - 1:
            self.popTail()
            return

        i = 0
        curr = self.head
        while i != idx - 1 and curr.next:
            curr = curr.next
            i += 1
        
        if curr.next.next:
            temp = curr.next
            curr.next.next.prev = curr
            curr.next = curr.next.next
            return temp.val
    
    def getLength(self):
        l = 0
        curr = self.head
        while curr.next:
            l += 1
            curr = curr.next 
        return l + 1
               
    def printList(self):
        curr = self.head
        while curr:
            print(f"{curr.val} ",end='')
            curr = curr.next
        print()
        
obj = DoublyLL()
obj.insertHead(3)
obj.insertHead(2)
obj.insertHead(1)
obj.insertHead(0)
obj.printList()
obj.popAtSpecifiedIndex(3)
obj.printList()