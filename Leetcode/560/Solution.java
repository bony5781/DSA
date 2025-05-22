class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int countSequence = 0;

        for (int num : nums) {
            sum += num;

            if (sum == k) {
                countSequence++;
            }

            if (map.containsKey(sum - k)) {
                countSequence += map.get(sum - k);
            }

            // Always update the map with the current sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return countSequence;
    }
}
