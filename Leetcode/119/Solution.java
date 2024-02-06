class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for (int currRow = 1; currRow <= rowIndex; currRow++) {
            ans.add(new ArrayList<>());
            List<Integer> currRowElements = ans.get(currRow);
            List<Integer> prevRowElements = ans.get(currRow - 1);
            currRowElements.add(1);
            for (int j = 1; j < prevRowElements.size(); j++) {
                currRowElements.add(prevRowElements.get(j) + prevRowElements.get(j - 1));
            }
            currRowElements.add(1);
        }
        return ans.get(ans.size() - 1);
    }
}