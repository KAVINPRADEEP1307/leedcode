class Solution {
    public String toLowerCase(String s) {
        String lower=s.toLowerCase();   //Java inbuilt function
     return lower;
    }
}

//Method 2: without toLowerCase
// String lower="";
//for(int i=0; i<s.length(); i++){
//     char ch= s.charAt(i);

// If character is uppercase (A-Z), convert it to lowercase
//     if(ch>= 'A' && ch<='Z'){

// Add 32 to ASCII value to get corresponding lowercase
//         ch= (char)(ch+ 32);
//     }

// Append the lowercase character to the result
//     lower= lower + ch;
// } 
//     return lower;