class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        subset(new ArrayList<>(),nums,0,list);
        return list;
    }
   public void subset(List<Integer> ans, int[] nums, int idx, List<List<Integer>> list) {
       if(idx==nums.length) {
       list.add(new ArrayList<>(ans));
        return;
       }
        int i =nums[idx];
       ans.add(i);                         // pick
subset(ans, nums, idx + 1, list);  // next index

ans.remove(ans.size() - 1);        // undo
subset(ans, nums, idx + 1, list); 
    }
}