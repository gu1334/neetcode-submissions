class Solution {
    public int search(int[] nums, int target) {
         int left = 0;

        int right = (nums.length) -1 ;

        while( left <= right){
        int mediun = left + (right - left) / 2;
        
            if(nums[mediun] == target){
                return mediun;
            }else if(nums[mediun] < target){
                left = mediun + 1;
            }else{
                right = mediun -1;
            }
        }
        return -1;

    }
}
