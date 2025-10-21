package BasicOfProgramming;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        if (x<0 || x==0){
            return false;
        }
        int n = x;
            while (n!=0){
                int last = n%10;
                reverse = (reverse*10) + last;
                n=n/10;
            }
            if (reverse == x){
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
            int n = 0;
            System.out.println(isPalindrome(n));
    }
}
