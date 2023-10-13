import java.util.*;

class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i;
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        for(i = 0; i < nums1.length; i++){
            s1.add(nums1[i]);
        }

        for(i = 0; i < nums2.length; i++){
            s2.add(nums2[i]);
        }

        s1.retainAll(s2);
        int[] result = new int[s1.size()];
        i = 0;
        for (Integer j: s1) {
            result[i++] = j;
        }
        return result;
    }
}