public class Solution {
    // write code here
    public static boolean hasSharedDigit(int a,int b){
        if(a < 10 || a > 99) return false;
        if(b < 10 || b > 99) return false;
        
        int arr1[] = new int[2];
        int arr2[] = new int[2];
        
        arr1[0] = a % 10;
        arr1[1] = (a / 10) % 10;
        
        arr2[0] = b % 10;
        arr2[1] = (b / 10) % 10;
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                if(arr1[i] == arr2[j]) return true;
            }
        }
        
        return false;
        
    }
}