class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // Only start counting if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
