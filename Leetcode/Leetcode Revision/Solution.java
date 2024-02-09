//9-02-24
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ans = new ArrayList<>();
//         ans.add(new ArrayList<>());
//         ans.get(0).add(1);

//         for(int i = 1; i < numRows; i++){
//             ans.add(new ArrayList<>());
//             List<Integer> currRowElements = ans.get(i);
//             List<Integer> prevRowElements = ans.get(i - 1);
//             currRowElements.add(1);
//             for(int j = 1; j < prevRowElements.size(); j++){
//                 currRowElements.add(prevRowElements.get(j) + prevRowElements.get(j-1));
//             }
//             currRowElements.add(1);
//         }
//         return ans;
//     }
// }