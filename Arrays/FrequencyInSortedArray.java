public class FrequencyInSortedArray {
    public static void main(String[] args) {
        int arr[] = {10,10,10,30,30,40};
        int freq = 1;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                freq ++;
            }
            else
            {
                System.out.println(arr[i-1] + " : " + freq);
                freq = 1;
            }
        }
        System.out.println(arr[arr.length-1] + " : " + freq);
    }
}
