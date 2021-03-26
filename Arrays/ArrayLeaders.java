public class ArrayLeaders {
    // Leader element is the element that has nothing greater than it on the right side of the array.
    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};
        int cur_leader = arr[arr.length-1];
        System.out.println(cur_leader);
        for(int i=arr.length - 1; i>=0; i--){
            if(arr[i]>cur_leader){
                cur_leader=arr[i];
                System.out.println(cur_leader);
            }
        }
    }
    
}
