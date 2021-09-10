class MaxConsectiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int big_max = 0;
        int cur_max = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 1){
                cur_max++;
                if(cur_max > big_max) {
                    big_max = cur_max;
                }
            }else{
                cur_max = 0;
            }
        }
        return big_max;
    }
}