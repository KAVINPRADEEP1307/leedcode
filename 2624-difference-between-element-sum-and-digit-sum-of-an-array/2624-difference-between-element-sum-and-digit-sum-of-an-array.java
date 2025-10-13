class Solution {
    public int differenceOfSum(int[] nums) {
        int digit_sum=0;
        int array_sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            array_sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            int num=nums[i];
            while(num>0){
                digit_sum+=num%10;
                num=num/10;
            }
        }
        int ans=digit_sum>array_sum?digit_sum-array_sum:array_sum-digit_sum;
        return ans;
    }
}