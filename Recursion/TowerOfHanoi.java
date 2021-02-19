public class TowerOfHanoi {

    public static int toh(int num){
        if (num==0)
            return 0;
        else{
            return toh(num/10) + (num%10);
        }
        
    }
    public static void main(String[] args) {
        int num = 253;
        System.out.println(toh(num));
    }
}
