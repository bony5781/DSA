class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int maxConsecutiveOnes = 0;
       int tempCount = 0;
       for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                tempCount++;
            }else{
                tempCount = 0;
            }
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, tempCount);
       }
       return maxConsecutiveOnes;
    }
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}