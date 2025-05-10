import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }

        while(k < nums.length){
            nums[k] = 0;
            k++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.moveZeroes(new int[]{1, 2, 3, 0, 9}); 
    }
}