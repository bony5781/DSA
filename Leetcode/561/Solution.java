class Solution {
    public int arrayPairSum(int[] nums) {
        // Sort the array so we can get the minimum element
        Arrays.sort(nums);
        int sum = 0;

        // Add only the first element of the pair
        for(int i = 0; i < nums.length - 1; i+= 2){
            sum += nums[i];
        }

        return sum;
    }
}