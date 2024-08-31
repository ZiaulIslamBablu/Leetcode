# Another way to slove​

class Solution {
<br>
    public int removeDuplicates(int[] nums) {
    <br>
        int j = 1;
        <br>
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
