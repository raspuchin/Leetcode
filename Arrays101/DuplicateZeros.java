class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int i=0,j;
        while(i < arr.length){
            if(arr[i] == 0){
                j = arr.length - 1;
                while(j >= i+2){
                    arr[j] = arr[j-1];
                    j--;
                }
                if(i+1 < arr.length)
                    arr[i+1] = 0;
                i += 2;
            }else{
                ++i;
            }
        }
    }
}