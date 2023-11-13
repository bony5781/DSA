public class Solution {
    // write code here
    public static boolean canPack(int bigCount, int smallCount, int goal){
        
        return bigCount*5+smallCount>=goal && goal>=0 && goal%5<=smallCount;
        
    }
}