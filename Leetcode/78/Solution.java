import java.util.ArrayList;
import java.util.List;

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();
        aList.add(new ArrayList<Integer>() {
        });
        for (int i = 0; i <= nums.length - 1; i++) {
            ArrayList<Integer> a1 = new ArrayList<>();
            a1.add(nums[i]);
            aList.add(a1);
            for (int j = i + 1; j < nums.length - 1; j++) {
                ArrayList<Integer> a2 = new ArrayList<>();
                a2.add(nums[i], nums[j]);
                aList.add(a2);
            }
        }
        return aList;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[] { 1, 2 };
        System.out.println(s.subsets(nums));
    }
}