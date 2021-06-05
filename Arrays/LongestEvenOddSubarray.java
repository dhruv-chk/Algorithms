public class LongestEvenOddSubarray {
    public static void main(String[] args) {
        int arr[] = {5,10,20,6,3,8};

        int res=1, cur=1;

        for(int i=1; i<arr.length; i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0)||(arr[i]%2!=0&&arr[i-1]%2==0)){
                cur += 1;
                res = Math.max(res, cur);
            }
            else
                cur = 1;
        }
        System.out.println(res);
    }
    
}
