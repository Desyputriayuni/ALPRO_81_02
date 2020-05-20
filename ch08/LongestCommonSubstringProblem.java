package ch08;

public class LongestCommonSubstringProblem {
    static String x, y;
    //returns length of fungtion for longest common
    //substring of x[0..m-1] and y[0..n -1]
    static int lcsp (int i, int j, int k){
       if (i == 0 || j ==0){
           return k;
       }
       if (x.charAt(i - 1) == y.charAt(j - 1)){
           k = lcsp(i - 1, j - 1, k + 1);
       }
       k = Math.max(k, Math.max(lcsp(i,j - 1,0), lcsp(i -1, j, 0)) );
       return k;
    }
    //Driver code
    public static void main(String[] args) {
        int n, m;
        x = "DESY";
        y = "PUTRI AYUNI";

        n = x.length();
        m = y.length();
        System.out.println(lcsp(n, m,0));
    }
}
