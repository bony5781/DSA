public class GfgJump {
    public static int minJumps(int[] arr){
        int jump = 0;
        int pos = 0;
        int des = 0;
        
        for(int i = 0; i < arr.length-1; i++){
            des = Math.max(des, arr[i] + i);
            System.err.println(des);
            if(pos == i){
                pos = des;
                jump++;
            }
        }
        
        if(pos >= arr.length - 1){
            return jump;
        }else return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }
}
