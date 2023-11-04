class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n == 1) return intervals;

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        ArrayList<int[]> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            if(ans.size() != 0 && end <= ans.get(ans.size()-1)[1])
            {
                continue;
            }

            for(int j = i + 1; j < n; j++){
                if(intervals[j][0] <= end){
                    end = Math.max(end, intervals[j][1]);
                }else{
                    break;
                }
            }

            int[] a = new int[]{start, end};
            ans.add(a);
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}