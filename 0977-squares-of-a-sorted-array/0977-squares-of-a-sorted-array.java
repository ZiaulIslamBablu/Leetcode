class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        //Squares all elements
      for (int i = 0; i<nums.length; i++){
          nums[i] = nums[i]*nums[i];
      }  
        
        
        int k = 0;
        int l = nums.length -1;
        for (int j = nums.length-1 ; j>=0;j--){
            if(nums[k] > nums[l]){
                result[j]= nums[k];
                k++;
            }
            else{
                result[j]= nums[l];
                l--;
            }
            
        }
        return result;
    }
    
}