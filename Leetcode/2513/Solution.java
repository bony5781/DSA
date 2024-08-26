import java.util.ArrayList;
import java.util.Collections;


class Solution {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        

        // First divisor case
        int temp = 0, i = 1;
        List<Integer> arr1 = new ArrayList<>();
        while(temp < uniqueCnt1){
            if(i != divisor1 && i % divisor1 != 0){
                temp++;
                arr1.add(i);
            }
            i++;
        }

        System.out.println(arr1);
        // Second divisor case
        temp = 0; i = 1;
        List<Integer> arr2 = new ArrayList<>();
        while(temp < uniqueCnt2){
            if(!arr1.contains(i) && i != divisor2 && i % divisor2 != 0){
                temp++;
                arr2.add(i);
            }
            i++;
        }
        System.out.println(arr2);
        
        int max =  Collections.max(arr1) > Collections.max(arr2) ? Collections.max(arr1) :
        Collections.max(arr2);

        return max; 

    }
}