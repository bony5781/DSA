class Solution {
    int isPalindrome(String S) {
        
        if(S == null || S.isEmpty()){
            return 1 ;
        }
        
        int start = 0;
        int end = S.length() - 1;
        
        while(start < end){
            if(S.charAt(start) != S.charAt(end)){
                return 0;
            }else{
                start++;
                end--;
            }
        }
        
        return 1;
    }
};