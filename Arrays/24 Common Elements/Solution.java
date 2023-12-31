import java.util.ArrayList;
import java.util.HashMap;

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> Amap = new HashMap<>();
        HashMap<Integer, Integer> Bmap = new HashMap<>();
        HashMap<Integer, Integer> Cmap = new HashMap<>();

        // Create 3 different hashmaps
        for(int i = 0; i < n1; i++){
            Amap.put(A[i],i);
        }
        for(int i = 0; i < n2; i++){
            Bmap.put(B[i],i);
        }
        for(int i = 0; i < n3; i++){
            Cmap.put(C[i],i);
        }

        // Check if they contain all elements
        for(int i = 0; i < n1; i++){
            if(Amap.containsKey(A[i]) && Bmap.containsKey(A[i]) && Cmap.containsKey(A[i])){
                ans.add(A[i]);
                Amap.remove(A[i]);
            }
        }

        return ans;
    }
}