class MyHashSet {

    Node head;

    class Node{
        int key;
        Node next;
        Node(int key){
            this.key = key;
            this.next = null;
        }
    }

    public MyHashSet() {
    }
    
    public void add(int key) {
        Node newNode = new Node(key);
        if(contains(key)) return;
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    
    public void remove(int key) {
        if(head == null){
            return;
        }
        if(head.key == key){
            head = head.next;
        }
        Node currNode = head.next;
        Node prevNode = head;
        while(currNode != null){
            if(currNode.key == key && currNode.next != null){
                prevNode.next = currNode.next;
            }
            if(currNode.key == key && currNode.next == null){
                prevNode.next = null;
            }
            currNode = currNode.next;
            prevNode = prevNode.next;
        }
    }
    
    public boolean contains(int key) {
        if(head == null) return false;
        Node currNode = head;
        while(currNode != null){
            if(currNode.key == key){
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */