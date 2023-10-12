//Time Complexity: O(m+n)
//Space Complexity: O(m+n)
import java.util.HashSet;
import java.util.Set;

class SetImplementation {
    public static int doUnion(int a[], int n, int b[], int m) {
        int i;
        Set<Integer> s = new HashSet<Integer>();
        for (i = 0; i < n; i++)
            s.add(a[i]);
        for (i = 0; i < m; i++)
            s.add(b[i]);

        return s.size();
    }

    public static void main(String[] args) {
        int a[] = new int[] { 1, 2, 3, 3, 5 };
        int n = a.length;
        int b[] = new int[] { 1, 2, 4, 5, 6 };
        int m = b.length;
        System.out.print(doUnion(a, n, b, m));
    }
}