import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public void rearrange(int[] arr, int n){
        HashMap<Integer, Integer> hmap1 = new HashMap<>();
        HashMap<Integer, Integer> hmap2 = new HashMap<>();
        int p = 0, q = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                hmap1.put(p,arr[i]);
                p++;
            }else{
                hmap2.put(q,arr[i]);
                q++;
            }
        }

        p = 0; q = 0;
        int i = 0;
        while(hmap1.size() > 0 && hmap2.size() > 0){
            if(i % 2 == 0){
                arr[i] = hmap2.get(q);
                hmap2.remove(q);
                q++;
            }else{
                arr[i] = hmap1.get(p);
                hmap1.remove(p);
                p++;
            }
            i++;
        }

        while(hmap1.size() > 0){
            arr[i] = hmap1.get(p);
            hmap1.remove(p);
            p++;
            i++;
        }

        while(hmap2.size() > 0){
            arr[i] = hmap2.get(q);
            hmap2.remove(q);
            q++;
            i++;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 3, -4, -1, 9};
        int n = arr.length;
        System.out.println("Arrays before rearranging : " + Arrays.toString(arr));
        s.rearrange(arr, n);
        System.out.println("Arrays after rearranging : " + Arrays.toString(arr));
    }
}
