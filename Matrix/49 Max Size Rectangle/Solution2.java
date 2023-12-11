import java.util.Stack;

class Solution2 {

    public int[] prevSmaller(int M[]) {
        int ps[] = new int[M.length];
        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < M.length; i++) {
            while (!s.isEmpty() && M[s.peek()] >= M[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    public int[] nextSmaller(int M[]) {
        int ns[] = new int[M.length];
        Stack<Integer> s = new Stack<Integer>();

        for (int i = M.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && M[s.peek()] >= M[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ns[i] = M.length;
            } else {
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }

    public int maxHistogram(int M[]) {
        int maxAns = 0;
        int ps[] = prevSmaller(M);
        int ns[] = nextSmaller(M);

        for (int i = 0; i < ps.length; i++) {
            System.out.print(ps[i]);
        }
        System.out.println();

        for (int i = 0; i < M.length; i++) {
            int currAns = ((ns[i] - ps[i] - 1) * M[i]);
            maxAns = Math.max(currAns, maxAns);
        }
        return maxAns;
    }

    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int currRow[] = M[0];
        int maxAns = maxHistogram(currRow);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] == 1) {
                    currRow[j] += 1;
                } else {
                    currRow[j] = 0;
                }
            }
            int currAns = maxHistogram(currRow);
            maxAns = Math.max(currAns, maxAns);
        }

        return maxAns;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int m[][] = { { 1, 1, 1, 1, 1 },
                { 0, 1, 0, 0, 0 } };
        System.out.println(s.maxArea(m, 2, 5));
    }
}