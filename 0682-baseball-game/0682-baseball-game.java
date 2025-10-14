class Solution {
    public int calPoints(String[] operations) {
        int[] result=new int[operations.length];int j=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                result[j-1]=0;
                j--;
            }
            else if(operations[i].equals("D")){
                result[j]=2*result[j-1];
                j++;
            }
            else if(operations[i].equals("+")){
                result[j]=result[j-1]+result[j-2];
                j++;
            }
            else{
                result[j]=Integer.parseInt(operations[i]);
                j++;
            }
        }
        int sum=0;
        for(int i=0;i<result.length;i++){
            sum+=result[i];
        }
        return sum;
    }
}