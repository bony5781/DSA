import java.util.HashMap;

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int i = 0, j = 0;
        
        while(i < n && j < m){
            hmap.put(a[i],i);
            hmap.put(b[j],j);
            i++; j++;
        }
        
        while(i < n){
            hmap.put(a[i],i);
            i++;
        }
        
        while(j < m){
            hmap.put(b[j],j);
            j++;
        }
        
        return hmap.size();
        
    }
}