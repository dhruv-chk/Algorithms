public class JosephusProblem {

    public static int jos(int n, int k){

        if(n==1)
            return 0;

        return (jos(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
        int num = 5, k = 3;
        System.out.println(jos(num, k));
    }
}
