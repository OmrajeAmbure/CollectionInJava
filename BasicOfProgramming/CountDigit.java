package BasicOfProgramming;

public class CountDigit {
    public static int countDigit1(int n){
        int count = 0;
        if (n == 0){
            return 1;
        }
        while (n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int countDigit2(int n){
        int count = (int)Math.log10(n);
        return count;
    }
    public static void main(String[] args) {
        int n = 678;
        int ans = countDigit1(n);
        System.out.println(ans);
    }
}
