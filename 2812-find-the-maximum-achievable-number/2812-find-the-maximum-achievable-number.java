class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int ans = num;
        for(int i=1; i<=t; i++){
            ans += 2;
        }
        return ans;
    }
}