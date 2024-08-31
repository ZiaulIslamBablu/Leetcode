class Solution {
    public int removeDuplicates(int[] nums) {
        int inx = 1, count =1, pre = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]==pre){
                count++;
                if (count<=2){
                    nums[inx] = nums[i];
                    inx++;
                
                }
                
            }
            else{
                nums[inx] = nums[i];
                inx++;
                pre = nums[i];
                count = 1;              
            }
        }
        return inx;
    }
}