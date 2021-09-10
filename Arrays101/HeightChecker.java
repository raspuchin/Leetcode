class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        int i,j,temp;
        for(i=0;i<sorted.length;i++)
            sorted[i] = heights[i];
        
        for(i=0;i<sorted.length;i++)
            for(j=0;j<sorted.length-1;j++)
                if(sorted[j] > sorted[j+1]){
                    temp = sorted[j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = temp;
                }
        int count = 0;
        for(i=0;i<sorted.length;i++)
            if(sorted[i] != heights[i])
                count++;
        
        return count;
    }
}