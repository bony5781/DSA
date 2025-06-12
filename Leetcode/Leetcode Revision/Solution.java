//12-06-25
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left= 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}

//8-06-25
class Solution {
    public int longestConsecutive(int[] nums) {
        //If array is empty, maximum sequence is 0
        if(nums.length == 0) return 0;

        //To store all the elements of the array in hashset
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        //To store the answer
        int currLength = 0, maxLength  = 1;

        //Iterate over hashset as we dont want repeating elements
        for(int num: set){
            //Check if it  is the starting element or not
            if(!set.contains(num - 1)){
                //It is a new sequence
                currLength = 1;
                num += 1;
                //Find the length of the sequence and update the maximum one
                while(set.contains(num)){
                    currLength += 1;
                    num += 1;
                }
                maxLength = Math.max(maxLength, currLength);
            }
        }
        return maxLength;
    }
}

//7-06-25
class Solution {

    public void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public void reverse(int[] nums, int left, int right){
        while(left <= right){
            swap(nums, left, right);
            left++; right--;
        }
    }
    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }

         if(i >= 0){
            int j = nums.length - 1;
            // Find the first element from the right that is greater than nums[i]
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        // Reverse the suffix starting from i + 1
        reverse(nums, i + 1, nums.length - 1);
    
    }
}

//6-06-25
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0, negative = 1;
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                ans[positive] = nums[i];
                positive += 2;
            }else{
                ans[negative] = nums[i];
                negative += 2;
            }
        }

        return ans;
    }
}

//5-06-25
class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int maxProfit = 0;

        for(int sellDay = 1; sellDay < prices.length; sellDay++){
            int currProfit = prices[sellDay] - prices[buyDay];
            maxProfit = Math.max(currProfit, maxProfit);
            if(currProfit < 0){
                buyDay = sellDay;
            }
        }

        return maxProfit;
    }
}

//4-06-25
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}


//3-06-25
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        for(int num: nums){
            if(count == 0){
                candidate = num;
            }
            count = (candidate == num) ? count +  1 : count - 1;
        }
        return candidate;
    }
}

//02-06-25
class Solution {

    public void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public void sortColors(int[] nums) {
        int left = 0, mid = 0, high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, left, mid);
                left++; mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
}

//31-05-25
class Solution {
    //Set row zero
    public void setRowZero(int[][] matrix, int row, int rows, int cols){
        for(int j = 0; j < cols; j++){
            matrix[row][j] = 0;
        }
    }

    //Set col zero
    public void setColZero(int[][] matrix, int col, int rows, int cols){
        for(int i = 0; i < rows; i++){
            matrix[i][col] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean setBoth = false;
        boolean setFirstColZero = false;
        boolean setFirstRowZero = false;

        if(matrix[0][0] == 0){
            setBoth = true;
        }

        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0){
                setFirstColZero = true;
            }
        }

        for(int j = 0; j < cols; j++){
            if(matrix[0][j] == 0){
                setFirstRowZero = true;
            }
        }

        //Check all except 1st row and 1st column
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //Set all rows zero(except 0-0)
        for(int i = 1; i < rows; i++){
            if(matrix[i][0] == 0){
                setRowZero(matrix, i, rows, cols);
            }
        }

        //Set all cols zero(except 0-0)
        for(int j = 1; j < cols; j++){
            if(matrix[0][j] == 0){
                setColZero(matrix, j, rows, cols);
            }
        }

        //First element is 0
        if(setBoth == true){
            setRowZero(matrix, 0, rows, cols);
            setColZero(matrix, 0, rows, cols);
        }

        if(setBoth == false && setFirstColZero == true){
            setColZero(matrix, 0, rows, cols);
        }

        if(setBoth == false && setFirstRowZero == true){
            setRowZero(matrix, 0, rows, cols);
        }
    }
}

//29-05-25
class Solution {

    public void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public void reverse(int[] nums, int left, int right){
        while(left < right){
            swap(nums, left, right);
            left++; right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;

        int i = n - 1;
        while(i >= 0 && (nums[i] >= nums[i + 1])){
            i--;
        }

        System.out.println(i);
        if(i == -1){
            reverse(nums, 0, n);
            return;
        }

        int j = n;
        while(j > i && nums[j] <= nums[i]){
            j--;
        }

        swap(nums, i, j);
        reverse(nums, i + 1, n);
    }
}

//28-05-25
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0, negative = 1;
        int[] ans = new int[nums.length];

        for(int num: nums){
            if(num >= 0){
                ans[positive] = num;
                positive += 2;
            }else{
                ans[negative] = num;
                negative += 2;
            }
        }    

        return ans;
    }
}

//27-05-25
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int tempProfit;
        int left = 0, right = 1;

        while(right < prices.length){
            tempProfit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, tempProfit);
            if(tempProfit < 0){
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}

//25-05-2025
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}

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
