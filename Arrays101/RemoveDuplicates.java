class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            while(i+1 < n && nums[i] == nums[i+1]){

                for(int j=i+1; j<n-1; j++){
                    nums[j] = nums[j+1];
                }
                n--;
            }
        }
        return n;
    }
}