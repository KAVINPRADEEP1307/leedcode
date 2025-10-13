class Solution {
    public int addDigits(int num) {
        int sum = 0;

        while(sum > 9 || sum == 0){
            while(num > 0){
                sum += num%10;
                num /= 10;
            }
            num = sum;
            sum = 0;
            if(num < 10 ) break;
        }
        return num;
    }
}