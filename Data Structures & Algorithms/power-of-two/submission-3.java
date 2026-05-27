class Solution {
    public boolean isPowerOfTwo(int n) {
        double p=1;
        for(int i=0;i<=31;i++)
        {
            p=Math.pow(2,i);
            if(p==n)
            return true;
        }
        return false;
    }
}