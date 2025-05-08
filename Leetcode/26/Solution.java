class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }else{
                nums[k] = nums[i];
                k++;
            }
        }

        int ans = k;
        while(k < nums.length){
            nums[k] = -1;
            k++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.removeDuplicates(new int[] {1,2, 3, 5}));
    }
}