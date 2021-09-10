class MoveZeros {
    public void moveZeroes(int[] arr) {
        int i,j;
        int n=arr.length;
        for(i=0; i<n;){
            if(arr[i] == 0){
                for(j=i; j<n-1; j++)
                    arr[j] = arr[j+1];
                arr[n-1] = 0;
                n--;
            }else{
                i++;
            }
        }
    }
}