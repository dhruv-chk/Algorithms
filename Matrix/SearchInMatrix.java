public class SearchInMatrix {
    public static void main(String[] args) {
        int matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]];
        int target = 3;

        boolean foundFlag = false;

        for(int i=0; i<matrix.length; i++){
            int low =0, high =matrix[i].length;
            
            while(low<=high){
                int mid = (low+high)/2;
                if(target == matrix[i][mid]){
                    System.out.println("Found at position: " + i + "," + mid);
                    foundFlag = true;
                    break;
                }
                else if(target<matrix[i][mid])
                    mid = high;
                else
                    mid = low;
            }
            
            if(foundFlag)
                break;
        }
    }
}
