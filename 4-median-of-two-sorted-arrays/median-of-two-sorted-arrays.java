class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i =0 ,j=0,k=0;
        int n =nums1.length,m=nums2.length;
        int ans[] = new int[n + m];
        while(j <m && i < n){
            if(nums1[i] <= nums2[j]) ans[k++]=nums1[i++];
            else ans[k++]=nums2[j++];
        }
       
        while(i < n) ans[k++]=nums1[i++];
         while(j < m) ans[k++]=nums2[j++];
         double md= 0.0;
         int idx= (0+ans.length-1)/2;
         if(ans.length % 2 ==0){
            
            md =(ans[idx ]+(ans[idx+1]))/2.0;
         }else md=ans[idx];
         return md;
    }
}