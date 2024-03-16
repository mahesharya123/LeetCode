class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int m = word1.length(), n=word2.length();
        int i=0, j=0;
        while(i<m && j<n){
            s += word1.charAt(i);
            i++;
            s +=word2.charAt(j);
            j++;
        }
         while(i<m){
               s += word1.charAt(i);
             i++;
         }
         while(j<n){
             s += word2.charAt(j);
             j++;
         }
        
        return s;
    }
}