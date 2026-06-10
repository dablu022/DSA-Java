class Solution {
    public double myPow(double x, int n) {
        int N=n;
        if(n<0){
             x = 1 / x;
            N = -N;
        }
        return po(x,N);
    }
public static double po(double x, int n){
    if(n==0) return 1;
    double call=po(x,n/2);
    if(n%2==0) return call*call;
    else return x*call*call;
}

}