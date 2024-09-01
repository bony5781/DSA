//Optimal probably
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] != target[i]){
                return false;
            }
        }
        return true;
    }
}

//My solution
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num: target){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }

        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) - 1);
            }else{
                return false;
            }
        }

        for (int value : map.values()) {
            if(value != 0) return false;
        }

        return true;
    }
}