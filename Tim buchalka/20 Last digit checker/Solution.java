public class Solution {
    // write code here
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a < 10 || a > 1000) return false;
        if(b < 10 || b > 1000) return false;
        if(c < 10 || c > 1000) return false;
        
        int arr[] = new int[3];
        arr[0] = a % 10;
        arr[1] = b % 10;
        arr[2] = c % 10;
        
        if(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) return true;
  
        return false;
    }
    
    public static boolean isValid(int num){
        
        if(num < 10 || num > 1000) return false;
        
        return true;
        
    }
}
