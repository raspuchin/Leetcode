class SquaresInSortedArray {
    public int[] sortedSquares(int[] nums) {
        int i,j,tmp;
        for(i=0; i<nums.length; i++) {
            nums[i] *= nums[i];
        }
        
        for(i=0;i<nums.length; i++){
            for(j=i+1; j<nums.length; j++){
                if(nums[j] < nums[i]){
                    tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        
        return nums;
    }
}