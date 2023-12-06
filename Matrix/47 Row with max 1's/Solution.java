class Solution {

    int lowerbound(int arr[], int m, int target) {
        int low = 0, high = m - 1;
        int ans = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int ans = -1;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int counter = m - lowerbound(arr[i], m, 1);
            if (counter > max) {
                max = counter;
                ans = i;
            }
        }

        return ans;
    }
}

// My solution(Brute force)
// class Solution {
// int rowWithMax1s(int arr[][], int n, int m) {
// // code here
// int max = 0;
// int ans = -1;

// for(int i = 0; i < n; i++){
// int counter = 0;
// for(int j = 0; j < m; j++){
// if(arr[i][j] == 1) counter++;
// }
// if(counter > max){
// max = counter;
// ans = i;
// }
// }

// return ans;
// }
// }