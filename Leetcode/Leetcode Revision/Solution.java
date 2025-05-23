//24-05-25
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

// 13-05-2025
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{ map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}


// 16/02/24
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ans = new ArrayList<>();
//         if (numRows == 0)
//             return ans;
//         ans.add(new ArrayList<>());
//         ans.get(0).add(1);

//         for (int currRow = 1; currRow < numRows; currRow++) {
//             ans.add(new ArrayList<>());
//             List<Integer> currRowElements = ans.get(currRow);
//             List<Integer> prevRowElements = ans.get(currRow - 1);

//             currRowElements.add(1);
//             for (int j = 1; j < prevRowElements.size(); j++) {
//                 currRowElements.add(prevRowElements.get(j) + prevRowElements.get(j - 1));
//             }
//             currRowElements.add(1);
//         }

//         return ans;
//     }
// }

// 15/02/24
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashSet<Character> hset = new HashSet<>();
//         int maxLength = 0;
//         int left = 0;
//         for(int right = 0; right < s.length(); right++){
//             if(!hset.contains(s.charAt(right))){
//                 hset.add(s.charAt(right));
//                 maxLength = Math.max(maxLength, right - left + 1);
//             }else{
//                 while(hset.contains(s.charAt(right))){
//                     hset.remove(s.charAt(left));
//                     left++;
//                 }
//             }
//             hset.add(s.charAt(right));
//         }
//         return maxLength;
//     }
// }

// 13/02/24
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
//         ListNode result = new ListNode(0);
//         ListNode answer = result;
//         int carry = 0;
//         while(l1 != null || l2 != null || carry > 0){
//             int sum = 0;
//             if(l1 != null){
//                 sum += l1.val;
//                 l1 = l1.next;
//             }
//             if(l2 != null){
//                 sum += l2.val;
//                 l2 = l2.next;
//             }
//             sum += carry;
//             ListNode temp = new ListNode(sum%10);
//             result.next = temp;
//             result = temp;
//             carry = sum / 10;
//         }   
//         return answer.next;       
//     }
// }

//9-02-24
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ans = new ArrayList<>();
//         ans.add(new ArrayList<>());
//         ans.get(0).add(1);

//         for(int i = 1; i < numRows; i++){
//             ans.add(new ArrayList<>());
//             List<Integer> currRowElements = ans.get(i);
//             List<Integer> prevRowElements = ans.get(i - 1);
//             currRowElements.add(1);
//             for(int j = 1; j < prevRowElements.size(); j++){
//                 currRowElements.add(prevRowElements.get(j) + prevRowElements.get(j-1));
//             }
//             currRowElements.add(1);
//         }
//         return ans;
//     }
// }
