class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int i = 0;
        int j,k;
        int l = 0;
        boolean flag = true;

        char[] arr1 = new char[len1];
        char[] arr2 = new char[len2];
        arr1[0] = s.charAt(0);
        arr2[0] = t.charAt(0);

        int[] word1 = new int[len1];
        int[] word2 = new int[len2];
        word1[0] = 0;
        word2[0] = 0;

        for(j = 1; j<len1; j++){
            flag = true;
            k = 0;
            while(k != j ){
                if( arr1[k] == s.charAt(j) ){
                    word1[j] = k;
                    flag = false;
                    break;
                }
                k++;
            }
            if (flag){
                l++;
                arr1[l] = s.charAt(j);
                word1[j] = l;
            }
        }

        l = 0;
        for(j = 1; j<len2; j++){
            flag = true;
            k = 0;
            while(k != j ){
                if( arr2[k] == t.charAt(j) ){
                    word2[j] = k;
                    flag = false;
                    break;
                }
                k++;
            }
            if (flag){
                l++;
                arr2[l] = t.charAt(j);
                word2[j] = l;
            }
        }

        for(i=0; i<len1;i++){
            if(word1[i] == word2[i]){
                flag = true;
            }
            else{
                flag = false;
                i = len1;
            }
        }
        

        return flag;
    }
}