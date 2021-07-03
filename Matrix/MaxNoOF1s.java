public class MaxNoOF1s {
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                      {0, 0, 1, 1},
                      {1, 1, 1, 1},
                      {0, 0, 0, 0}};

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i][0] == 1){
                System.out.println(i);
                break;
            }
                
        }
    }
}
