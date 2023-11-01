class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        while(m > 0 && n > 0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[last] = nums1[m-1];
                m -= 1;
            }else{
                nums1[last] = nums2[n-1];
                n -= 1;
            }
            last -= 1;
        }

        while(n > 0){
            nums1[last] = nums2[n-1];
            last -= 1;
            n -= 1;
        }
    }
}

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int left = n - 1;
        int right = 0;
        
        while(left >= 0 && right < m && arr1[left] > arr2[right]){
            long temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
            left--; right++;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      
    }
}