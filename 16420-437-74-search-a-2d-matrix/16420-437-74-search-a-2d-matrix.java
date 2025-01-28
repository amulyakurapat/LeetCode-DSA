class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix==null || matrix[0].length==0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m*n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int midval = matrix[mid/n][mid%n];
            if(midval==target){
                return true;
            } else if(midval<target){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return false;
    }
}