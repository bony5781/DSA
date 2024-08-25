class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int i = 0, j = 0;
        int flag  = 1;
        int ans = 0;
        
        for(i = 0; i < arr1.length; i++){
            flag = 1;
            for(j = 0; j < arr2.length; j++){
                System.out.println(arr1[i]);
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) ans += 1;
        }

        return ans;
    }
}

// Optimal solution
// class Solution {
//     public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

//         int count=0;
        
//         for(int i=0; i<arr1.length; i++){
//             boolean withinDistance = false;
//             for(int j=0; j<arr2.length; j++){
//                 if((Math.abs(arr1[i]-arr2[j])) <= d) {
//                     withinDistance = true;
//                     break;
//                 }
//             }
//             if(!withinDistance) count++;
//         }
//         return count;
//     }
// }