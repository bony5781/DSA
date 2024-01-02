package revision.com;

import java.util.HashMap;

public class Main {

    //Union of 2 arrays
    public int doUnion(int[] a, int n, int[] b, int m){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < n; i++){
            hmap.put(a[i],i);
        }
        for(int i = 0; i < m; i++){
            hmap.put(b[i],i);
        }

        return hmap.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {-10, -2, -3, -4};
        int[] arr2 = {7, 55, 6, -4};
        int n = arr1.length;
        int m = arr2.length;
        Main main = new Main();
        System.out.println("Answer : " + main.doUnion(arr1, n, arr2, m));
    }
}