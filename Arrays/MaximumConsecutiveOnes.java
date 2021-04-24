public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0};
        int maxCount = 0, count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count += 1;
                
                if(maxCount < count){
                    maxCount = count;
                }
            }
            else
                count = 0;
        }

        System.out.println(maxCount);
    }    
}
