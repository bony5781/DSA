class Solution {
    public String intToRoman(int num) {
        int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String stringValues[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                num -= values[i];
                ans.append(stringValues[i]);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.intToRoman(49));
    }
}