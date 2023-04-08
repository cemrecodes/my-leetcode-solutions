class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int limit = nums.length/2;
        int i = len - 1;
        int pivot = -1;
        int firstHalf = 0;
        int scndHalf = 0;
        boolean flag = true;
        int j = 0;

        while(i>0){
            scndHalf += nums[i];
            i--;
        }

        if(firstHalf == scndHalf){
            flag = false;
            pivot = 0;
        }

       

        while(j<len-1 && flag ){
            firstHalf += nums[j];
            scndHalf -= nums[j+1];
            
            if(firstHalf == scndHalf){
                flag = false;
                pivot = j+1;
            }

            j++;
        }

        return pivot;
    }
}