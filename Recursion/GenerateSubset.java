public class GenerateSubset {

    public static void subsets(String s, String cur, int i){
        
        if(i==s.length()){
            System.out.println(cur);
            return;
        }

        subsets(s, cur, i+1);
        subsets(s, cur + s.charAt(i), i+1);
    }
    public static void main(String[] args) {
        String s = "ABC", cur = "";
        int i=0;
        subsets(s, cur, i);
    }
}
