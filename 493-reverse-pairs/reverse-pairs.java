class Solution {
    static int cnt;
    public static void inversion(int [] a,int[] b){
        int i=0 ,j=0;
        while(i < a.length && j < b.length){
            if((long)a[i] > (long)2*(long)b[j]) {
                cnt+=(a.length-i);
                j++;
            } 
           else i++;
        }
    }
    public int reversePairs(int[] arr) {
       cnt=0;
      mergesort(arr);
        return cnt;
     
    }

    public static void mergesort(int[] arr) {

        int n = arr.length;

        if (n <= 1)
            return;

        int idx = 0;

        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];

        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];

        mergesort(a);
        mergesort(b);
        inversion(a,b);
        merge(a, b, arr);
    }

    private static void merge(int[] a, int[] b, int[] arr) {

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] <= b[j])
                arr[k++] = a[i++];

            else{
                
                arr[k++] = b[j++];
            }
        }

        while (i < a.length)
            arr[k++] = a[i++];

        while (j < b.length)
            arr[k++] = b[j++];
    }
}   
  