class Solution {
    public double myPow(double x, int n) {
        if(n<0)
        {
            x=1/x;
            n=-n;
        }
        double p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*x;
        }
        return p;
    }
}
