import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();        
        ll.addFirst("is");
        ll.addFirst("a");
        System.out.println(ll);
        ll.addLast("a");
        ll.addLast("girl");
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
