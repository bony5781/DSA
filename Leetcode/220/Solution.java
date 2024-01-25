class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int low = nums1.length < nums2.length ? nums1.length : nums2.length;
        int[] ans = new int[low];
        int k = 0;

        for(int i = 0; i < nums1.length; i++){
            if(!hmap.containsKey(nums1[i])){
                hmap.put(nums1[i],1);
            }else{
                hmap.put(nums1[i],hmap.get(nums1[i])+1);
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(hmap.containsKey(nums2[i]) && hmap.get(nums2[i]) > 0){
                ans[k++] = nums2[i];
                hmap.put(nums2[i],hmap.get(nums2[i])-1);
            }
        }
        
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = ans[i];
        }
        return res;
    }
}