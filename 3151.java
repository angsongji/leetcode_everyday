class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1 ; i<nums.length ; i+=2){
            if (nums[i]%2 != 0){
                if(nums[i-1]%2 != 0 || (i+1<nums.length && nums[i+1]%2 != 0 ))
                            return false;  
            }else{
                if( nums[i-1]%2 == 0 || (i+1<nums.length && nums[i+1]%2 == 0 ))
                            return false;
            }
        }
        return true;
    }
}