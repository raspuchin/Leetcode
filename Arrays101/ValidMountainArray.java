class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        boolean increasing = true;
        for(int i=0; i<arr.length-1; i++){
            if(increasing){
                if(arr[i] < arr[i+1]){
                    continue;
                }else if(arr[i] > arr[i+1]){
                    if(i == 0)
                        return false;
                    increasing = false;
                }else{
                    return false;
                }
            }else{
                if(arr[i] > arr[i+1]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return !increasing;
    }
}