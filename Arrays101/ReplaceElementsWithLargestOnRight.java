class ReplaceElementsWithLargestOnRight {
    public int[] replaceElements(int[] arr) {
        int i,j, temp_max;
        for(i=0;i<arr.length; i++){
            if(i == arr.length -1 ){
                arr[i] = -1;
            }else{
                temp_max = Integer.MIN_VALUE;
                for(j=i+1; j<arr.length; j++)
                    temp_max = (temp_max > arr[j]) ? temp_max : arr[j];
                arr[i] = temp_max;
            }
        }
        return arr;
    }
}