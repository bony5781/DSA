class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hmap.containsValue(nums[i])){
                hmap.put(nums[i],i);
            }else{
                return true;
            }
        }
        return false;
    }
}