class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reachability = 0;

        for(int i = 0; i < n; i++){
            if(reachability < i) return false;
            reachability = Math.max(reachability, nums[i]+ i);
        }

        return true;
    }
}