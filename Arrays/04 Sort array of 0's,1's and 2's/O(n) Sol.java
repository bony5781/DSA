//Dutch national flag algorithm
//Link - https://www.youtube.com/watch?v=oaVa-9wmpns
//Time complexity : O(n)
//Space complexity : O(1)

class Solution {

    public static void swap(int[] a, int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;
        
        while(mid <= high){
            switch(nums[mid]){
                case 0:
                    swap(nums,low,mid);
                    low++; mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,high);
                    high--;
                    break;
            }
        }
    }
}