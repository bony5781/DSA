class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length - 1;
        int rightElement = Integer.MIN_VALUE;
        
        for(int i = n; i >= 0; i--){
            if(arr[i] >= rightElement){
                ans.add(0, arr[i]);
                rightElement  = arr[i];
            }
        }
        return ans;
    }
}
