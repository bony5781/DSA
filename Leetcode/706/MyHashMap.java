class MyHashMap {

    Node head;

    class Node {
        int key;
        int value;
        Node next;

        Node(int key,int value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        Node newNode = new Node(key,value);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode != null){
            if(currNode.key == key){
                currNode.value = value;
                return;
            }
            if(currNode.next == null){
                currNode.next = newNode;
                return;
            }
            currNode = currNode.next;
        }
    }
    
    public int get(int key) {
        Node currNode = head;
        while(currNode != null){
            if(currNode.key == key){
                return currNode.value;
            }
            currNode = currNode.next;
        }
        return -1;
    }
    
    public void remove(int key) {

        if(head == null){
            return;
        }

        if(head.key == key){
            head = head.next;
            return;
        }

        Node currNode = head.next;
        Node prevNode = head;
        while(currNode != null && prevNode != null){
            if(currNode.key == key && currNode.next != null){
                prevNode.next = currNode.next;
                return;
            }
            if(currNode.key == key && currNode.next == null){
                prevNode.next = null;   
                return;             
            }
            currNode = currNode.next;
            prevNode = prevNode.next;
        }
    }

    public void printList() {
        if (head == null)
            System.out.println("List is empty");
        Node currNode = head;
        while (currNode != null) {
            System.out.print("[ "  + currNode.key + " , " + currNode.value +  " ] -> " );
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */