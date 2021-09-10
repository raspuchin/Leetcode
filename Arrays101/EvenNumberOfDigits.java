class EvenNumberOfDigits {
    private int calculateDigits(int num){
        int len = 0;
        while(num != 0){
            len++;
            num /= 10;
        }
        return len;
    }
    
    public int findNumbers(int[] nums) {
        int total=0;
        for(int i=0; i<nums.length; i++){
            if(calculateDigits(nums[i])%2 == 0)
                total++;
        }
        return total;
    }
}