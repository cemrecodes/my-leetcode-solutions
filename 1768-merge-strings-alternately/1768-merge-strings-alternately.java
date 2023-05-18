class Solution {
    public String mergeAlternately(String word1, String word2) {
     String mergedWord = "";
     int len1 = word1.length();
     int len2 = word2.length();
     int max, min;
     String longWord;

     int result = Integer.compare(len1, len2);

     if ( result > 0 ){
         max = len1;
         min = len2;
         longWord = word1;
     }
     else{
         max = len2;
         min = len1;
         longWord = word2;
     } 

    for(int i = 0; i<max; i++){
        if( i < min ){
        mergedWord += word1.charAt(i);
        mergedWord += word2.charAt(i);
        }
        else{
            mergedWord += longWord.charAt(i);
        }

    }
     return mergedWord;
    }
}