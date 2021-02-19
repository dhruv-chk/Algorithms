class Main{
    public static int sumOfDigits(int num){
        if (num==0)
            return 0;
        else{
            return sumOfDigits(num/10) + (num%10);
        }
        
    }
    public static void main(String[] args) {
        int num = 253;
        System.out.println(sumOfDigits(num));
    }
}