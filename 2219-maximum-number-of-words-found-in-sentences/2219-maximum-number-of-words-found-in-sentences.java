class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;   // stores the maximum number of words found so far
        
        for (int i = 0; i < s.length; i++) {  // loop through each sentence
            String arr[] = s[i].split(" ");   // split sentence into words using space (" ") as delimiter
            max = Math.max(max, arr.length);  // update max if current sentence has more words
        }  
        
        return max;  // return the maximum word count
    }
}