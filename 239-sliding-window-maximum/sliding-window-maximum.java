class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        int n= nums.length;

        for(int i=0;i<k-1;i++){
            
                while(dq.size()!=0 && nums[dq.peekLast()]<nums[i]) dq.removeLast();
                dq.addLast(i);
        }

            for(int i=k-1;i<n;i++){
                while(dq.size()!=0 && nums[dq.peekLast()]<nums[i]) dq.removeLast();
                dq.addLast(i);
                if(dq.peekFirst()<=i-k) dq.removeFirst();
                ans.add(nums[dq.peekFirst()]); 
            }
            int[] rs= new int[ans.size()];
            for(int i=0;i<ans.size();i++){
                rs[i]=ans.get(i);
            }
            return rs;
    }
}