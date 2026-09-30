class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
   List<Integer> ans= new ArrayList<>();
        int n=arr.length;
        int i=0;
        while(i<n){
        int rightidx = arr[i] -1;
        if(arr[i] == i+1 || arr[rightidx] == arr[i]) i++;
        else swap(i,rightidx,arr);
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=1+j) ans.add(1 + j);
        }
       return ans; 
        
        
    }
    public static void swap(int i,int j,int[]nums){

             int temp =nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

        }

}