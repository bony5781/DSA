class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int b = arrays.get(0).get(0);
        int a = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            maxDistance = Math.max(maxDistance, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - b));
            maxDistance = Math.max(maxDistance, Math.abs(a - arrays.get(i).get(0)));
            b = Math.min(b, arrays.get(i).get(0));
            a = Math.max(a, arrays.get(i).get(arrays.get(i).size() - 1));
        }

        return maxDistance;

    }
}