class Solution {
    public int titleToNumber(String columnTitle) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            hmap.put(s.charAt(i),i+1);
        }

        int ans = 0;
        int j = 0;
        for(int i = columnTitle.length() - 1; i >= 0; i--){
            ans += hmap.get(columnTitle.charAt(i)) * Math.pow(26,j++);
        }

        return ans;
    }
}