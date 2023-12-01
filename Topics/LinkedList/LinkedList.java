public class LinkedList {

    Node head;
    private int size;

    public LinkedList() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null)
            System.out.println("List is empty");
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }

        currNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();
        // list.addLast("a");
        // list.addLast("boy");
        // list.printList();
        System.out.println(list.getSize());
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}