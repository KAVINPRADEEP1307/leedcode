class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i]=start+2*i; //using the formula given in the question
        }
        int x=0;
        for(int i=0; i<n; i++)
        {
            x=x^nums[i];   //XOR of any number with 0 is that number itself.
        }
        return x;
    }
}