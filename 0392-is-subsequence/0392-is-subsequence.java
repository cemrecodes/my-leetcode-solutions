class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int counter = 0;
        boolean flag = false;
        int tlen = t.length();
        int slen = s.length();

        if(slen > tlen){
            i = tlen;
        }

        while( i<tlen && j<slen){
            if( s.charAt(j) == t.charAt(i) ){
                    j+=1;
                    i+=1;
                    counter +=1;
            }
            else
                i+=1;
        }
    
        if (counter == slen)
            flag = true;

        return flag;
    }
}