public class GfgJump {
    public static int minJumps(int[] arr){
        int jump = 0;
        int pos = 0;
        int des = 0;
        
        for(int i = 0; i < arr.length-1; i++){
            des = Math.max(des, arr[i] + i);
            if(pos == i){
                pos = des;
                jump++;
            }
        }
        
        if(pos >= arr.length - 1){
            return jump;
        }else return -1;
    }
}
